package org.user;

public class UserProcessor {

    public static User createUser(String username, String password) {
        if (userDB.contains(username)) {
            return existingUser;
        }
        else {
            return new User(username, password);
        }
    }
}
