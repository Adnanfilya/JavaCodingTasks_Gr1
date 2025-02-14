package mustafa;

import java.util.ArrayList;
import java.util.Collections;

public class Task05_FrequencyOfCharacters {

          /*
        Write a return method that can find the frequency of characters
              Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
          */


        public static void main(String[] args) {

            String result=frequencyChar("AAABBCDD" );
            System.out.println(result);}


    /**
     * String Return Method to count the character frequency of expressions of type String.
     * @param input
     * @return
     */
        public static String frequencyChar(String input){

            ArrayList<Character> charList = new ArrayList<>();
            for (char each: input.toCharArray()) {
                charList.add(each);}

            String output = "";
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                if (currentChar == ' ') {
                    continue;}
                else if (output.indexOf(currentChar) == -1) {
                    int frequency = Collections.frequency(charList, currentChar);
                    output =output+ currentChar  + frequency;}}
                      return output;
        }}

