package mustafa;

import java.util.ArrayList;

public class Task06_RemoveDublicates {

    /*

    Write a return method that can remove the duplicated values from String
    Ex:removeDub("AAABBBCCC")==>ABC
     */

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String result=removeDub(input );

        System.out.println("removeDub("+input+")==>"+result);}


    /**
     * The string method counts the characters and prints the duplicates once
     * @param input
     * @return
     */
    public static String removeDub(String input){

        ArrayList<Character> charList = new ArrayList<>();
        for (char each: input.toCharArray()) {
            charList.add(each);}

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == ' ') {
                continue;}
            else if (output.indexOf(currentChar) == -1) {
                     output =output + currentChar;}}
        return output;
    }}



