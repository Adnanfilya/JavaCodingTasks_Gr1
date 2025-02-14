package adnan;
// Write a return method that can find the frequency of characters
//Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2v

public class T05_FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(findFrequancy("aabbccc"));
    }

    /**
     * method that can find the frequency of characters
     * @param str
     * @return
     */

    public static String findFrequancy(String str) {


        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            for (int j = 0; j <= str.length() -1 ; j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (str.indexOf(currentChar) == i) {
                result += currentChar + "" + count;
            }



        }

        return result;
    }
}
