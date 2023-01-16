package com.company;

public class PolicyCheckRequestHandler extends AbstractRequestHandler {
    /** This handler checks if the user provided has admin rights */

    public void handleRequest(WebRequest request)  {
        String path = request.getPath();
        User user = request.getLoggedUser();

        if (!user.isAdmin() && path == "/dashboard"){
            System.out.println("Status 403 : user is not authorized to access this content");
        } else {
            super.handleRequest(request);
        }
    }
}
