package adnan;

/*
Swap two integer variable values
(including both ways; with using a third variable and without it)
 */
public class Task03_SwapTwoNumber {

    public static void main(String[] args) {
        swapTwoNumber1(30, 500);
        swapTwoNumber2(500, 50);
    }

    /**
     * custom class which swaps two integer
     * with using a third one
     */
    public static void swapTwoNumber1(int num1, int num2) {

        int num3 = 0;

        num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println(num1 + "-" + num2 + "-" + num3);
    }

    /**
     * custom class which swaps two integer
     * without using a third one
     * simple math
     */
    public static void swapTwoNumber2(int num1, int num2) {


        num1 += num2;
        num2 = num1 - num2;
        num1 = num1 - num2;


        System.out.println(num1 + "*" + num2);
    }


}
