package mustafa;
public class Task03_SwapNumbers {
/*
    Swap Numbers:
    Swap two integer variable values (including both ways; with using a third variable and without it)
     */

    public static void main(String[] args) {

        swapTwoNumber(10,20);
        swapTwoNumber02(10,20);
    }

    /**
     * Two numbers swapped with third variable
     * @param number1
     * @param number2
     */

    public static void swapTwoNumber(int number1, int number2) {
        int temp;
        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("New Number 1: " + number1);
        System.out.println("New Number 2: " + number2);
    }

    /**
     * Two numbers swapped without third variable
     * @param number1
     * @param number2
     */
    public static void swapTwoNumber02(int number1, int number2) {


        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("New number1: " + number1);
        System.out.println("New number2: " +number2);


    }
}


