package selim;

public class Task09_PasswordValidation {


    /*
    1.password must be at least 6 characters and should not contain space
    2.password should at least contain one upperCase letter
    3.password should at least contain one lowerCase letter
    4.password should at least contain one special character letter
    5.password should at least contain digit
     */
    public static void main(String[] args) {
        String password = "Abc@123";
        System.out.println("Is password valid? " + isValidPassword(password));
    }
    /**
     * this method determine is password  valid or not
     * @param password
     * @return
     */
    public static boolean isValidPassword(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }
















}
