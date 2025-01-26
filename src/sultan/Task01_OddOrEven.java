package sultan;

public class Task01_OddOrEven {

    /*
    Write a method that can identify a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
     */

    public static void main(String[] args) {

        //First way
        System.out.println("identify(5) = " + identify(5));
        System.out.println("identify(6) = " + identify(6));

        System.out.println("*****************");

        //Second way
        String result = identify(5);
        System.out.println("result = " + result);
        String result2 = identify(6);
        System.out.println("result2 = " + result2);

    }


    /**
     * Checks if the given number odd or even
     */
    public static String identify(int number) {

        return number % 2 == 0 ? "Even" : "Odd";

    }


}
