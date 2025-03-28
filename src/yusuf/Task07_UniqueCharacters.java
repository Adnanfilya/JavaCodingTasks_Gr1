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

        //Temporary variable to store the unique values
        String result = "";

        //Iterate through all strings and find unique values
        for (int i = 0; i < str.length(); i++) {
            //Store each character in the currentChar variable
            char currentChar = str.charAt(i);
            //Changing count if character appears again
            int count = 0;

            //Second for loop dedicated to currentChar to check if its repeated in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    //Increasing count if same character appears in the iteration
                    count++;
                }

            }
            //If count is 1, it means that character is unique
            if (count == 1) {

                result += currentChar;

            }
        }

        return result;

    }
}
