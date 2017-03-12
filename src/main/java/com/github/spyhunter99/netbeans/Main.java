/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.spyhunter99.netbeans;

import java.io.File;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import org.netbeans.License;
import org.netbeans.Module;
import org.netbeans.ModuleGroup;
import org.netbeans.ModuleUpdates;

/**
 *
 * @author AO
 */
public class Main {

    int downloadSuccess = 0;
    int downloadErrors = 0;
    int downloadSkipped = 0;
    JAXBContext jc = null;
    XMLInputFactory xif = null;

    public Main() throws Exception {
        jc = JAXBContext.newInstance(ModuleUpdates.class);

        xif = XMLInputFactory.newFactory();
        xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
    }

    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    private void process(Object get, String baseUrl, File dl, File syncFolder) throws Exception {
        if (get instanceof Module) {
            Module m = (Module) get;
            DownloadJob job = new DownloadJob();
            if (!m.getDistribution().startsWith("http")) {
                String distro = baseUrl + m.getDistribution();
                job.destination = dl.getAbsolutePath() + "/" + m.getDistribution();
                job.URL = distro;
            } else {
                job.URL = m.getDistribution();
                String path = new URL(job.URL).getPath();
                job.destination = syncFolder.getAbsolutePath() + path;
            }

            queue.add(job);
        } else if (get instanceof ModuleGroup) {
            ModuleGroup group = (ModuleGroup) get;
            for (int k = 0; k < group.getModuleGroupOrModule().size(); k++) {
                process(group.getModuleGroupOrModule().get(k), baseUrl, dl, syncFolder);
            }
        } else if (get instanceof License) {
            License l = (License) get;
            if (((License) get).getUrl() != null) {
                DownloadJob job = new DownloadJob();
                if (l.getUrl().startsWith("http")) {
                    job.URL = l.getUrl();
                    String path = new URL(job.URL).getPath();
                    job.destination = syncFolder.getAbsolutePath() + path;
                } else {
                    //relative url
                    job.URL = baseUrl + l.getUrl();
                    job.destination = dl.getAbsolutePath() + "/" + l.getUrl();
                }
                queue.add(job);
            }

        }
    }

    private void start(String indexUrl) throws Exception {

        //download the index file, parse it, then download all of the files
        File outputDir = new File("sync");
        outputDir.mkdirs();
        File workingDir = new File("temp");
        workingDir.mkdirs();

        URL url = new URL(indexUrl);
        String path = url.getPath();    //with the index file
        String[] bits = path.split("/");
        String indexFileName = bits[bits.length - 1];
        path = path.substring(0, path.lastIndexOf("/")) + "/";

        File dl = new File(outputDir, path);
        dl.mkdirs();

        downloadIndexFile(indexUrl, outputDir.getAbsolutePath() + path + indexFileName);
        if (indexUrl.endsWith(".gz")) {
            //unpack
            gunzipIt(outputDir.getAbsolutePath() + path + indexFileName, workingDir.getAbsolutePath() + "/catalog.xml");
            String baseUrl = indexUrl.replace(indexFileName, "");   //download url minux the filename

            XMLStreamReader xsr = xif.createXMLStreamReader(new StreamSource(new File(workingDir, "catalog.xml")));

            Unmarshaller unmarshaller = jc.createUnmarshaller();
            ModuleUpdates unmarshal = (ModuleUpdates) unmarshaller.unmarshal(xsr);

            //ModuleUpdates unmarshal = JAXB.unmarshal(new File(workingDir, "catalog.xml"), ModuleUpdates.class);
            for (int i = 0; i < unmarshal.getNotificationOrModuleGroupOrModuleOrLicenseOrError().size(); i++) {
                Object get = unmarshal.getNotificationOrModuleGroupOrModuleOrLicenseOrError().get(i);
                process(get, baseUrl, dl, outputDir);

            }
            //read index
            //enqueue all plugins
        } else if (indexUrl.endsWith(".xml")) {

            //unpack
            String baseUrl = indexUrl.replace(indexFileName, "");   //download url minux the filename

            XMLStreamReader xsr = xif.createXMLStreamReader(new StreamSource(new File(outputDir.getAbsolutePath() + path + indexFileName)));

            Unmarshaller unmarshaller = jc.createUnmarshaller();
            ModuleUpdates unmarshal = (ModuleUpdates) unmarshaller.unmarshal(xsr);

            //ModuleUpdates unmarshal = JAXB.unmarshal(new File(workingDir, "catalog.xml"), ModuleUpdates.class);
            for (int i = 0; i < unmarshal.getNotificationOrModuleGroupOrModuleOrLicenseOrError().size(); i++) {
                Object get = unmarshal.getNotificationOrModuleGroupOrModuleOrLicenseOrError().get(i);
                process(get, baseUrl, dl, outputDir);

            }
            //read index
            //enqueue all plugins
        }

    }

    static class DownloadJob {

        public String URL;
        public String destination;
    }

    ConcurrentLinkedQueue<DownloadJob> queue = new ConcurrentLinkedQueue<DownloadJob>();

    private void run(String[] args) throws Exception {

        String indexUrl = null;
        //certified
        indexUrl = "http://updates.netbeans.org/netbeans/updates/8.2/uc/final/certified/catalog.xml.gz";

        System.out.println("Getting index for certified plugins");
        start(indexUrl);

        System.out.println(queue.size() + " files to download");
        while (!queue.isEmpty()) {
            DownloadJob remove = queue.remove();
            if (remove != null) {
                downloadFile(remove.URL, remove.destination);
            }
        }

//comm
//most of these failed, need to investigate further
        indexUrl = "http://plugins.netbeans.org/nbpluginportal/files/nbms/pluginportal-update-center.xml";
        System.out.println("Getting index for Community Plug-in Portal update center:");
        start(indexUrl);
        System.out.println(queue.size() + " files to download");
        while (!queue.isEmpty()) {
            DownloadJob remove = queue.remove();
            if (remove != null) {
                downloadFile(remove.URL, remove.destination);
            }
        }
        //netbeans distro
        indexUrl = "http://updates.netbeans.org/netbeans/updates/8.2/uc/final/distribution/catalog.xml.gz";
        System.out.println("Getting index for netbeans distribution updates");
        start(indexUrl);
        System.out.println(queue.size() + " files to download");
        while (!queue.isEmpty()) {
            DownloadJob remove = queue.remove();
            if (remove != null) {
                downloadFile(remove.URL, remove.destination);
            }
        }
        //plugin portal
        System.out.println("Getting index for plugin portal");
        indexUrl = "http://plugins.netbeans.org/nbpluginportal/updates/8.2/catalog.xml.gz";
        start(indexUrl);
        System.out.println(queue.size() + " files to download");
        while (!queue.isEmpty()) {
            DownloadJob remove = queue.remove();
            if (remove != null) {
                downloadFile(remove.URL, remove.destination);
            }
        }
        //dev 
        indexUrl = "http://deadlock.netbeans.org/hudson/job/nbms-and-javadoc/lastStableBuild/artifact/nbbuild/nbms/updates.xml.gz";
        System.out.println("Getting index for development update center");
        start(indexUrl);
        System.out.println(queue.size() + " files to download");
        while (!queue.isEmpty()) {
            DownloadJob remove = queue.remove();
            if (remove != null) {
                downloadFile(remove.URL, remove.destination);
            }
        }
        for (int i = 0; i < 4; i++) {
            new Thread(new Downloader()).start();
        }
        while (!queue.isEmpty()) {
            Thread.sleep(1000);
        }
        System.out.println("Done");
        System.out.println("   Success " + downloadSuccess);
        System.out.println("   Errors  " + downloadErrors);
        System.out.println("   Skipped " + downloadSkipped);
        if (downloadErrors > 0) {
            System.out.println("Download error usually indicate either a network problem OR the netbeans index points to files that do not exist, were never published or were removed.");
        }
    }

    public class Downloader implements Runnable {

        @Override
        public void run() {
            while (!queue.isEmpty()) {
                DownloadJob remove = queue.remove();
                if (remove != null) {
                    downloadFile(remove.URL, remove.destination);
                }
            }
        }

    }

    /**
     * GunZip it
     */
    public void gunzipIt(String inputFile, String outputFile) {

        byte[] buffer = new byte[1024];

        try {

            GZIPInputStream gzis
                    = new GZIPInputStream(new FileInputStream(inputFile));

            FileOutputStream out
                    = new FileOutputStream(outputFile);

            int len;
            while ((len = gzis.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }

            gzis.close();
            out.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    void downloadFile(String url, String destination) {
        if (new File(destination).exists()) {
            downloadSkipped++;
            return;
        }
        System.out.println("Downloading " + url + " to " + destination);
        new File(destination).getParentFile().mkdirs();
        try {
            URL website = new URL(url);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(destination);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            downloadSuccess++;
        } catch (Exception ex) {
            downloadErrors++;
            System.out.println("failed!" + ex.getMessage());
        }
    }

    void downloadIndexFile(String url, String destination) throws Exception {
        URL website = new URL(url);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream(destination);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }
}
