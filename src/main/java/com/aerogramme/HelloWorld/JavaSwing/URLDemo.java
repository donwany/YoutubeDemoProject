package com.aerogramme.HelloWorld.JavaSwing;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL url1 = new URL("https://www.google.co.in/?gfe_rd=cr&ei=ptYq" +
                        "WK26I4fT8gfth6CACg#q=data+flair+java");

        URL url2 = new URL("http", "www.data-flair.com",
                "/jvm-works-jvm-architecture/");

        URL url3 = new URL("https://www.google.co.in/search?"+
                "q=gnu&rlz=1C1CHZL_enIN71" +
                "4IN715&oq=gnu&aqs=chrome..69i57j6" +
                "9i60l5.653j0j7&sourceid=chrome&ie=UTF" +
                "-8#q=data+flair+java");

        System.out.println(url1.toString());
        System.out.println(url2.toString());
        System.out.println();
        System.out.println("Different components of the URL3-");
        System.out.println("Protocol:- " + url3.getProtocol());
        System.out.println("Hostname:- " + url3.getHost());
        System.out.println("Default port:- " +
                url3.getDefaultPort());
        System.out.println("Query:- " + url3.getQuery());
        System.out.println("Path:- " + url3.getPath());
        System.out.println("File:- " + url3.getFile());
        System.out.println("Reference:- " + url3.getRef());
    }
}
