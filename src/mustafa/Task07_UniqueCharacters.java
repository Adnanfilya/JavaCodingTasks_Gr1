package mustafa;

import java.util.ArrayList;
import java.util.Collections;

public class Task07_UniqueCharacters {
    /*
    Write a return method that returns unique values from String
    Ex:unique("AAABCCCDEF")==>'DEF'
     */

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String result = removeDub(input);
        System.out.println("unique(" + input + ")==>" + result);
    }

    
    /**
     * The string method counts the characters and prints the single once
     *
     * @param input
     * @return
     */
    public static String removeDub(String input) {
        ArrayList<Character> charList = new ArrayList<>();
        for (char each : input.toCharArray()) {
            charList.add(each);
        }

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int frequency = Collections.frequency(charList, currentChar);


            if (frequency > 1) {
                continue;
            } else if (currentChar == ' ') {
                continue;
            } else if (output.indexOf(currentChar) == -1) {
                output = output + currentChar;
            }
        }
        return output;

    }
}


