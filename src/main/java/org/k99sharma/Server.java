package org.k99sharma;

public class Server {
    private String ipAddress;
    private int currentLoad;

    public Server(String ipAddress, int currentLoad){
        this.ipAddress = ipAddress;
        this.currentLoad = currentLoad;
    }

    public String getIpAddress(){
        return this.ipAddress;
    }

    public int getCurrentLoad(){
        return this.currentLoad;
    }

    public void incrementLoad(){
        this.currentLoad += 1;
    }
}
