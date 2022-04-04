package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    /**
     * created method testingFirstName() to check firstname is valid or not
     */
    public void testingFirstName() {
        /**
         * Creating Object for UserRegistration class
         */
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling checkFName method to see firstname is valid
         */
        boolean isFirstNameValid = userRegistration.checkFirstName("Jayant");
        Assertions.assertTrue(isFirstNameValid);
    }

    @Test
    /**
     * created method testFirstNameInvalidMustReturnFalse for false condition
     */
    public void testFirstNameInvalidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFirstnameValid = userRegistration.checkFName("Jayant");
        Assertions.assertFalse(isFirstnameValid);
    }
}
