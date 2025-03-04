package adnan;

public class Task06_RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicates("aassddaaasssddddcv");
    }

    /**
     * Method that removes duplicate chars from a string
     * @param str
     */
    public static void removeDuplicates(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.contains(String.valueOf(currentChar))){
                continue;
            }
            result += currentChar;

        }
        System.out.println(result);
    }
}
