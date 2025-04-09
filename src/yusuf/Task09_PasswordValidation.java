package yusuf;

public class Task09_PasswordValidation {

    /*
String -- Password Validation Task

Password MUST be at least 6 characters and should not contain space.

Write a return method that can verify if a password is valid or not. Requirements:

Password should at least contain one uppercase letter.

Password should at least contain one lowercase letter.

Password should at least contain one special character.

Password should at least contain one digit.

If all requirements above are met, the method returns true; otherwise, returns false.
     */

    public static void main(String[] args) {

        // All requirements are met.
        System.out.println(passValidation("A2!3B4c"));

        // 5 characters
        System.out.println("Password should be more than 5 characters. Requirement met: " + passValidation("A2!4c"));

        // Contains space
        System.out.println("Password should not contain space. Requirement met: " + passValidation("a bcd4!E"));

        // No special character.
        System.out.println("Password should contain special character. Requirement met: " + passValidation("A23B4c"));

        // No digit
        System.out.println("Password should contain at least one digit. Requirement met: " + passValidation("abcd!Ef"));

        // No letter
        System.out.println("Password should contain at least one letter. Requirement met: " + passValidation("44312!56"));

    }

    /**
     * Method that returns boolean value depending on password credentials requirement are met.
     * @param password parameter comes from main method
     * @return validation true/false depending on requirements are met or not.
     */
    public static boolean passValidation(String password) {

// Validation default is false we will try to turn it true later on.

        boolean validation = false;

// Password MUST be at least 6 characters and should not contain space.

        if (password.length() >= 6 && !password.contains(" ")) {

            boolean isUpperCase = false;
            boolean isLowerCase = false;
            boolean isDigit = false;
            boolean isSpecialChar = false;

            for (char each : password.toCharArray()) {
                // Password should at least contain one uppercase letter.
                if (Character.isUpperCase(each)) {
                    isUpperCase = true;
                    // Password should at least contain one lowercase letter.
                } else if (Character.isLowerCase(each)) {
                    isLowerCase = true;
                    // Password should at least contain one digit.
                } else if (Character.isDigit(each)) {
                    isDigit = true;
                    // Password should at least contain one special character.
                } else {
                    isSpecialChar = true;
                }
            }

            // Check credentials are met with and operator. If all of them are met validation will be true.
            // Default is already false no need extra steps.
            validation = isUpperCase && isLowerCase && isDigit && isSpecialChar;
        }

        return validation;
    }

}
