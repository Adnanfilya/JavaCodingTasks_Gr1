package yusuf;

public class Task04_ReverseNegativeNumber {
    /*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */

    public static void main(String[] args) {

        System.out.println(reverseDigits(0));
        System.out.println(reverseDigits(30));
        System.out.println(reverseDigits(-35));

    }

    /**
     * Reverse Digit Return Method for negative number with int return type.
     * Not using any StringBuilder/Array
     *
     * @param num
     * @return
     */
    public static int reverseDigits(int num) {

        if (num >= 0){
            System.out.print("Number cant be positive or equal to 0. Given num: ");
            return num;
        }
        int reversed = 0;
        while (num < 0) { //Continue if there is a digit
            int digit = num % 10; //Take the last digit
            reversed = reversed * 10 + digit; //Assign the new number to the reversed variable.
            num /= 10; //We removed last digit, with while loop we are moving to the next digit.
        }
        return reversed;
    }
}
