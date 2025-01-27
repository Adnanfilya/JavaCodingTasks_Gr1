package sultan;

public class Task03_SwapNumbers {

    /*
    Swap Numbers:
    Swap two integer variable values (including both ways; with using a third variable and without it)
     */


    public static void main(String[] args) {

        // First method
        swappingNumbers(8,9);

        // Second method
        System.out.println(swappingNumbers2(1905, 2025));
    }




    /**
     * swapping numbers with a third variable called 'temp' and used the return type 'void'.
     * @param num1
     * @param num2
     */
    public static void swappingNumbers(int num1, int num2){

        int temp = 0;

        temp = num1;
        num1=num2;
        num2=temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }



    /**
     * swapping numbers without any third variable and used a String return method.
     * @param num1
     * @param num2
     * @return
     */
    public static String swappingNumbers2(int num1, int num2){

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        return ("num1= " + num1 + "\nnum2= " + num2);
    }


}
