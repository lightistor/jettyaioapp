package site.shky.jetty;

import site.shky.jetty.be.JettyBasicServer;

public class EmbeddedJettyServerApp {

    public static void main(String[] args) throws Exception {
        JettyBasicServer jettyBasicServer = new JettyBasicServer();

        System.out.println("STARTING");
        jettyBasicServer.start();
        System.out.println("STARTED");
        System.out.println("JOINING");
        jettyBasicServer.getServer().join();
        System.out.println("JOINED");
        /*System.out.println("STOPPING");
        jettyBasicServer.stop();
        System.out.println("STOPPED");*/
    }
}
