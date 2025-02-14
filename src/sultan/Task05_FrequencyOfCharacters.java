package sultan;

import java.util.*;

public class Task05_FrequencyOfCharacters {

    public static void main(String[] args) {

        /*
         String - Frequency of Characters
         Write a return method that can find the frequency of characters
         Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */



        //#1.way to print
        String characters = "AAABBCDD";
        String frequencyOfCh = countingChars(characters);
        System.out.println(frequencyOfCh);
        //#2.way to print
        System.out.println(countingChars("HELLOO ANNA"));


    }


    /**
     * A String method for counting the characters in a string
     * that how many times they repeat
     * @param str String
     * @return result
     */
    public static String countingChars(String str) {

        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;


            // Skip spaces
            if (currentChar == ' ') {
                continue;
            }

            //Counting characters
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }


            // Avoid printing duplicates:
            if (str.indexOf(currentChar) == i) { // Check for first occurrence
                result += currentChar + "" + count;
            }

        }

        return result;

    }











}
