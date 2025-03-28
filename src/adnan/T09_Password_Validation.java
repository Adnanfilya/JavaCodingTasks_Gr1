package adnan;

public class T09_Password_Validation {
    public static void main(String[] args) {

        System.out.println(isValidPassword("asda1"));
        System.out.println(isValidPassword("ASa2 1"));
        System.out.println(isValidPassword("asDD11"));
        System.out.println(isValidPassword("asd34AQ,@:"));

    }

    /**
     * Method that validates given requirements
     * @param password
     * @return
     */
    public static boolean isValidPassword(String password) {

        if (password.length() < 6) {
            System.out.println("Password should be at least 6 char");
            return false;
        }
        if (password.contains(" ")) {
            System.out.println("Password should not contain space");
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char chr : password.toCharArray()) {
            if (Character.isUpperCase(chr)) {
                 hasUpperCase = true;
            } else if (Character.isLowerCase(chr)) {
                 hasLowerCase = true;
            } else if (Character.isDigit(chr)) {
                 hasDigit = true;
            } else if (!Character.isLetterOrDigit(chr)) {
                 hasSpecialChar = true;

            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }
}
