package selim;

public class FruquencyOfCharachters {

// ✅ String - Frequency of Characters
//
//    Write a return method that can find the frequency of characters
//
//    Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2 😎


    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AaSSssGGHHghh"));
    }
    /**
     * This method provides getting the characters of frequency
     *
     * @param str
     * @return
     */
    public static String frequencyOfChars(String str) {
        str = str.toLowerCase();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // get the current character
            int count = 0;
            // check!! is it append before?
            if (result.contains(String.valueOf(currentChar))) {
                continue; // if it is appended before pass it continue
            }
            // count the same characters
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) { // if same
                    count++; // raise the number
                }
            }
            // create the result
            result += currentChar + String.valueOf(count);
        }
        return result;
    }
}


