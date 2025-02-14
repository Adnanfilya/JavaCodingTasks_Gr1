package yusuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05_FrequencyCharacters {
    /*
      Write a return method that can find the frequency of characters

         Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        freqCharacters("AAABBCDD");
        freqCharacters("ACDBE");

    }

    /**
     * Used StringBuilder to count all of characters
     * @param characters
     */
    public static void freqCharacters(String characters) {
        StringBuilder result = new StringBuilder();
        while (!characters.isEmpty()) {//While loop because we dont know which prompt will be given
            char ch = characters.charAt(0);
            long count = characters.chars().filter(c -> c == ch).count();
            result.append(ch).append(count);
            characters = characters.replace("" + ch, "");
        }
        System.out.println(result);
    }
}
