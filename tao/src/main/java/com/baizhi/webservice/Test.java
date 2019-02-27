package com.baizhi.webservice;

import javax.xml.ws.Endpoint;

public class Test {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9000/web",new WebServiceImpl());
    }
}
