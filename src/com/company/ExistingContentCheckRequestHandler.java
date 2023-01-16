package com.company;

public class ExistingContentCheckRequestHandler extends AbstractRequestHandler{
    /** This handler checks if the path provided is valid */

    public void handleRequest(WebRequest request){
        String path = request.getPath();

        if (path == "/dashboard" || path == "/home"){
            super.handleRequest(request);
        } else {
            System.out.println("Status 404 : Page missing");
        }
    }
}
