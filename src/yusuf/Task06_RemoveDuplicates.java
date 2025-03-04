package yusuf;

public class Task06_RemoveDuplicates {

    /*

    Write a return method that can remove the duplicated values from String

     */


    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));

    }

    /**
     * Method that removes duplicated Strings and returns the result
     * @param str
     * @return
     */
    public static String removeDuplicates(String str){

        // Temporary variable to store the unique result
        String result = "";
        // Classic for loop to iterate through all strings
        for (int i = 0; i < str.length(); i++) {
            // If the result does not contain the same character, add it to the result
            if (!result.contains("" + str.charAt(i))) {
                // So in the first iteration since result does not contain any value we pass as parameter, it will add A
                // In the second iteration, since result contains A, it will not add A again.
                result += str.charAt(i);
            }
        }
        return result;

    }
}
