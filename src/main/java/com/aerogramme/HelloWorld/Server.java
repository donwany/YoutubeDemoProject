package com.aerogramme.HelloWorld;

public class Server {

    private String url;

    public Server(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Server{" +
                "url='" + url + '\'' +
                '}';
    }
}
