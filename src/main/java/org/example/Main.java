package org.example;

import org.encryption.MD5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String message = "sillyPassword123";
        String hashedMessage = MD5.hash(message);
        System.out.println(message + " -> " + hashedMessage);

    }
}