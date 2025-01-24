package yusuf;

public class Task03_SwapNumbers {

    /*
    Swap Numbers:
    Swap two integer variable values (including both ways; with using a third variable and without it)
     */

    public static void main(String[] args) {

        swapNumberWithTemp(5, 10);
        System.out.println();
        swapNumberWithoutTemp(30,20);
    }


    /**
     * Swapped two numbers with temporary variable
     * @param num1
     * @param num2
     */
    public static void swapNumberWithTemp(int num1, int num2) {
        int temp;

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Swapped Number 1: " + num1);
        System.out.println("Swapper Number 2: " + num2);
    }

    /**
     * Swapped two numbers without temporary variable
     * @param a
     * @param b
     */
    public static void swapNumberWithoutTemp(int a, int b) {

        System.out.println("Old number 1: " + a);
        System.out.println("Old number 2: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("New number 1: " + a);
        System.out.println("New number 2: " + b);


    }
}
