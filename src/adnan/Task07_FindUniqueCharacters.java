package adnan;

public class Task07_FindUniqueCharacters {
    public static void main(String[] args) {
        findUnique("AbccddddeeeeffffgGGgb");
    }

    /**
     * Method that finds unique characters in a string
     * using count condition
     * @param str
     */
    public static void findUnique(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            for (int j = 0; j <= str.length() - 1; j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count == 1) {
                result += currentChar;
            }
        }
        System.out.println(result);
    }
}

