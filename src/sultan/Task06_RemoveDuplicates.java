package sultan;

import java.util.*;

/*
Write a return method that can remove the duplicated values from String
 */
public class Task06_RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));
        System.out.println(removeDup(""));
        System.out.println(removeDup(" "));
        System.out.println(removeDup("11225488888"));

    }

    /**
     * A String method for finding the duplicates and then remove it
     *
     * @param str String
     * @return new String(chars, 0, num)
     */
    public static String removeDup(String str) {

        if (str.isBlank()) {
            return "Invalid Entry! Try again.";
        }

        char[] chars = str.toCharArray();
        Set<Character> handled = new LinkedHashSet<>();

        int num = 0; //unique character number/ index number

        for (char c : chars) {
            if (handled.add(c)) {
                chars[num++] = c; //equalizes the unique elements to the char Array
            }
        }
        return new String(chars, 0, num); //returns a new string
    }
}
