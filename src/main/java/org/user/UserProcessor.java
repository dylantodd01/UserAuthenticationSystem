package org.user;

import org.encryption.MD5;

public class UserProcessor {

    public static void createUser(String username, String password) {
        if (UserDB.userExists(username)) {
            System.out.println("Username already exists");
            return;
        }
        String hashedPassword = MD5.hash(password);
        System.out.println("User added");
        UserDB.addUser(username, hashedPassword, new User(username, hashedPassword));

    }
    public static void logInAttempt(String username, String password) {
        if (!UserDB.userExists(username)) {
            System.out.println("Username does not exist");
        } else if (UserDB.userObjects.get(username).isLoggedIn()) {
            System.out.println("User already logged in");
        } else if (UserDB.userDetails.get(username).equals(MD5.hash(password))) {
            UserDB.userObjects.get(username).loggedIn = true;
            System.out.println("Log in successful");
        } else {
            System.out.println("Log in unsuccessful");
        }

    }
}
