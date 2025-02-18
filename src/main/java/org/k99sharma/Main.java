package org.k99sharma;

public class Main {
    public static void main(String[] args){
        LoadBalancer loadBalancer = new LoadBalancer();

        loadBalancer.addServer("192.168.1.0", 10);
        loadBalancer.addServer("192.168.1.12", 10);
        loadBalancer.addServer("192.168.1.10", 10);

        String ipAddress = loadBalancer.getNextServer();
        System.out.println("Request is routed to server: " + ipAddress);

        ipAddress = loadBalancer.getNextServer();
        System.out.println("Request is routed to server: " + ipAddress);

        ipAddress = loadBalancer.getNextServer();
        System.out.println("Request is routed to server: " + ipAddress);
    }
}
