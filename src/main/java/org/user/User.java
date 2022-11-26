package org.user;

import org.encryption.MD5;

public class User {
    private String username;
    private String password;

    public boolean loggedIn = false;

    User (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
