package org.TestDrive;

import org.encryption.MD5;
import org.user.UserDB;
import org.user.UserProcessor;

public class TestDrive {
    public static void main(String args[]) {
        System.out.println("Test Drive");

        System.out.println("\nAdding user: dylantodd, password");
        UserProcessor.createUser("dylantodd", "password");
        System.out.println("\nAdding user: honor, monty");
        UserProcessor.createUser("honor", "monty");
        System.out.println("\nAdding user: dylantodd, password");
        UserProcessor.createUser("dylantodd", "password");

        System.out.println("\nLogging in dylantodd user...");
        UserProcessor.logInAttempt("dylantodd", "password");
        System.out.println("\nUnsuccessful log in...");
        UserProcessor.logInAttempt("dylantodd", "password");

        System.out.println("\nUser data:\n" +  UserDB.userDetails.toString());


    }
}
