package com.company;

public class RenderContentHandler extends AbstractRequestHandler {
    /** This handler show the content for the WebRequest (200) */

    public void handleRequest(WebRequest request)  {
        String path = request.getPath();

        if (path == "/dashboard"){
            System.out.println("Status 200 : Dashboard content here");
        } else if (path == "/home") {
            System.out.println("Status 200 : Home content here");
        }
    }
}
