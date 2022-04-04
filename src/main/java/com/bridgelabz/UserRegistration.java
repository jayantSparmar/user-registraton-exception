package com.bridgelabz;

/**
 * User Registration System needs to ensure all validations are in place during the User Entry.
 * @author Jayant Singh Parmar
 * @since 04-04-2021
 */

public class UserRegistration {
    public boolean checkFirstName(String firstName) {
        /**
         * regex pattern for FirstName
         */
        return (firstName.matches("[A-Z][a-z]{3,}"));
    }

    public boolean Lastname(String Lastname) {
        return (Lastname.matches("[A-Z][a-z]{3,}"));
    }

    public boolean checkEmail(String emailID) {
        return (emailID.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
    }


    public boolean checkPhoneNum(String phoneNum) {
        return (phoneNum.matches("91\\s[0-9]{10}"));
    }

    public boolean checkPassword(String password) {
        return (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$"));
    }
}
