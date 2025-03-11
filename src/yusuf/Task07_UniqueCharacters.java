package yusuf;

public class Task07_UniqueCharacters {

    /*

    Write a return method that returns unique values from String

     */

    public static void main(String[] args) {

        System.out.println(uniqueCharacters("AAABBBCCCDEF"));
    }

    /**
     * Method that removes repetitive characters and leaves unique ones
     * @param str in the main method
     * @return new result
     */
    public static String uniqueCharacters(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }

            }
            if (count == 1) {
                result += currentChar;

            }
        }

        return result;

    }
}
