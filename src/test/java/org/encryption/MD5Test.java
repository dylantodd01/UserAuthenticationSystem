package org.encryption;

import org.encryption.MD5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MD5Test {

    @Test
    @DisplayName("Checking hash output is a string")
    void checkHashOutputIsString() {
        // arrange
        String message = "Message to be hashed";

        // act + assert
        Assertions.assertInstanceOf(String.class, MD5.hash(message));
    }

    @Test
    @DisplayName("Checking string has changed")
    void checkStringHasChanged() {
        // arrange
        String message = "Message to be hashed";

        // act
        String hashedMessage = MD5.hash(message);

        // assert
        Assertions.assertNotEquals(message, hashedMessage);
    }


}
