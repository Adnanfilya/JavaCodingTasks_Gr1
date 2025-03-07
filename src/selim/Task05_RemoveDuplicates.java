package selim;

public class Task05_RemoveDuplicates {
    /*
    String remove duplicates
    write a return method that can remove duplicates values from a String
    String str = "AAABBBBCCC";
     */
    public static void main(String[] args) {
        String str = "AAAbBbbCcC";
        System.out.println(removeDuplicates(str)); // Output: ABC
    }

    /***
     * This method removes duplicate values of a String
     * @param str
     * @return
     */
    public static String removeDuplicates(String str) {
        String result = ""; // Store unique characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Convert to uppercase for case-insensitive comparison
            if (result.toUpperCase().indexOf(Character.toUpperCase(ch)) == -1) {
                result += ch; // Add the character if not already in result
            }
        }
        return result.toUpperCase();
    }
}










