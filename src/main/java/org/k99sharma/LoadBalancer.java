package org.k99sharma;

import java.util.ArrayList;
import java.util.List;

public class LoadBalancer {
    public List<Server> servers;

    public LoadBalancer(){
        this.servers = new ArrayList<>();
    }

    public void addServer(String ipAddress, int currentLoad){
        this.servers.add(new Server(ipAddress, currentLoad));
    }

    public String getNextServer(){
        if(servers.isEmpty())
            throw new IllegalStateException("No servers are available.");

        Server minLoadServer = servers.get(0);
        for(Server server : servers){
            if(server.getCurrentLoad() < minLoadServer.getCurrentLoad())
                minLoadServer = server;
        }

        minLoadServer.incrementLoad();
        return minLoadServer.getIpAddress();
    }
}
