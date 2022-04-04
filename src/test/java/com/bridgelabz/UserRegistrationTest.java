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
        boolean isFirstnameValid = userRegistration.checkFirstName("Jayant");
        Assertions.assertFalse(isFirstnameValid);
    }
    /**
     * created method testingLastName() to check lastname is valid or not
     */
    @Test
    public void testLastNameValidMustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling Lastname method to see LastName is valid
         */
        boolean isLastnameValid = userRegistration.Lastname("Parmar");
        Assertions.assertTrue(isLastnameValid);
    }

    /**
     * created method testLastNameInvalidMustReturnFalse for false condition
     */
    @Test
    public void testLastNameValidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLastnameINValid = userRegistration.Lastname("advani");
        Assertions.assertFalse(isLastnameINValid);
    }
    @Test
    /**
     * created method testEmailId_MustReturnTrue() for true condition
     */
    public void testEmailId_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling checkEmail method to see mailId is valid
         */
        boolean isEmailValid = userRegistration.checkEmail("jayantparmar420@gmail.com");
        Assertions.assertTrue(isEmailValid);
    }

    @Test
    /**
     * created method testEmailId_MustReturnFalse() for false condition
     */

    public void testEmailId_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailInvalid = userRegistration.checkEmail("jayant@.com");
        Assertions.assertFalse(isEmailInvalid);
    }

    @Test
    /**
     * created testPhoneNumber_MustReturnTrue() for True condition
     */
    public void testPhoneNumber_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling checkPhoneNum method to see phoneNumber is valid
         */
        boolean isPhoneNumberValid = userRegistration.checkPhoneNum("91 7566033032");
        Assertions.assertTrue(isPhoneNumberValid);
    }

    @Test
    /**
     * created testPhoneNumber_MustReturnFalse() for False condition
     */
    public void testPhoneNumber_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberInValid = userRegistration.checkPhoneNum("7566033032");
        Assertions.assertFalse(isPhoneNumberInValid);
    }


    @Test
    /**
     * created testPassword_MustReturnTrue() for True condition
     */
    public void testPassword_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling checkPassword method to see Password is valid
         */
        boolean isPasswordValid = userRegistration.checkPassword("Abc@123gjyg");
        Assertions.assertTrue(isPasswordValid);
    }

    @Test
    /**
     * created testPassword_MustReturnFalse() for False condition
     */
    public void testPassword_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordInValid = userRegistration.checkPassword("abcdefghi");
        Assertions.assertFalse(isPasswordInValid);
    }
}



