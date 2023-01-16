package com.company;

public class    WebRequest {
    private String path;
    private User loggedUser;

    public WebRequest(String path, User loggedUser) {
        this.path = path;
        this.loggedUser = loggedUser;
    }

    public String getPath() {
        return path;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public String requestLog() {
        User user = this.getLoggedUser();
        String userRole;
        if (user.isAdmin()){
            userRole = "admin user";
        } else {
            userRole = "non admin user";
        }
        String log = "Request made to " + this.getPath() + " by " + userRole;
        return log;
    }
}
