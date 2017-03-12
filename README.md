# NetbeansPluginCacher
A tool to download all Netbeans updates and plugins for offline installation

## How to use

`git clone https://github.com/spyhunter99/NetbeansPluginCacher.git`
`mvn clean install`
`java -jar target/NetbeansPluginCacher-<VERSION>-with-dependencies.jar`

The content of the `sync` folder can now be hosted offline

DNS forwarding can be accomplished with the following DNS entries
 
 - updates.netbeans.org
 - plugins.netbeans.org
 - deadlock.netbeans.org