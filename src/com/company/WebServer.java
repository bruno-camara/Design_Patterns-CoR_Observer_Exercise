package com.company;

public class WebServer {
    public AbstractRequestHandler requestHandler;

    public WebServer(AbstractRequestHandler requestHandler){
        this.requestHandler = requestHandler;
    }
    public String getRequest(WebRequest request) {
        this.requestHandler.handleRequest(request);
        return "";
    }
}
