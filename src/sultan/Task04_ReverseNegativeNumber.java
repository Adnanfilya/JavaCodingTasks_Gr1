package sultan;

import java.util.Arrays;
import java.util.Scanner;

public class Task04_ReverseNegativeNumber {

    /*
    Write a return method that can reverse digits
    of a negative number and return it as int
    input: -35  output: -53
     */

    public static void main(String[] args) {
        System.out.println("reversed number = " + reverseNumber(-35));
        System.out.println("reversed number = " + reverseNumber(-100));
        System.out.println("reversed number = " + reverseNumber(-12345));
        System.out.println("reversed number = " + reverseNumber(-187654321));
    }


    /**
     * Reversing the given number with a while method
     *
     * @param number
     * @return
     */
    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;                        // Getting the last digit
            reversedNumber = reversedNumber * 10 + lastDigit;   // Build the reversed number
            number /= 10;                                       // Removing the last digit
        }

        return reversedNumber;

    }




}
