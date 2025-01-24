package adnan;

public class Task01_OddOrEven {
    // codes from Sultan
    /*
Write a method that can identify  a given number is even or odd.

       EX:
              identify(5) --> "Odd"
              identify(6) --> "Even"
     */
    public static void main(String[] args) {


        identify(55);
        identify(66);
        identify(0);
        identify(-1);

    }

    public static void identify(int num) {

        /**
         * Checks if the given number odd or even
         */

        String result = num % 2 == 0 ? "even" : "odd";
        System.out.println(result);


    }
}
