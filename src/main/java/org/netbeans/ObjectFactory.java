//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.12 at 09:45:21 AM EDT 
//


package org.netbeans;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link License }
     * 
     */
    public License createLicense() {
        return new License();
    }

    /**
     * Create an instance of {@link L10N }
     * 
     */
    public L10N createL10N() {
        return new L10N();
    }

    /**
     * Create an instance of {@link Manifest }
     * 
     */
    public Manifest createManifest() {
        return new Manifest();
    }

    /**
     * Create an instance of {@link Module }
     * 
     */
    public Module createModule() {
        return new Module();
    }

    /**
     * Create an instance of {@link ExternalPackage }
     * 
     */
    public ExternalPackage createExternalPackage() {
        return new ExternalPackage();
    }

    /**
     * Create an instance of {@link ModuleGroup }
     * 
     */
    public ModuleGroup createModuleGroup() {
        return new ModuleGroup();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link ModuleUpdates }
     * 
     */
    public ModuleUpdates createModuleUpdates() {
        return new ModuleUpdates();
    }

}