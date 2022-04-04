package com.bridgelabz;

/**
 * User Registration System needs to ensure all validations are in place during the User Entry.
 * @author jayant singh parmar
 * @since 04-04-2021
 */

public class UserRegistration {
    public boolean checkFName(String firstName) {
        /**
         * regex pattern for FirstName
         */
        return (firstName.matches("[A-Z][a-z]{3,}"));

    }
}