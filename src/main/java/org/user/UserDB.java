package org.user;

import java.util.HashMap;

public class UserDB {
    public static HashMap<String, String> userDetails = new HashMap<String, String>();
    public static HashMap<String, User> userObjects = new HashMap<String, User>();

    public static boolean userExists(String username) {
        if (userDetails.containsKey(username)) {
            return true;
        }
        return false;
    }

    public static void addUser(String username, String hashedPassword, User userObj) {
        userDetails.put(username, hashedPassword);
        userObjects.put(username, userObj);
    }

}
