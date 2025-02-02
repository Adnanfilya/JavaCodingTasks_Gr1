package sultan;

public class Task02_Finra {

    /*
    Write a function that prints out the numbers from 1 to 30
    but for numbers that are a multiple of 3,
    print "FIN" instead of the number, and for numbers that
    are a multiple of 5, print "RA" instead of the number.
    For numbers that are a multiple of both 3 and 5, print
    "FINRA" instead of the number.
     */


    public static void main(String[] args) {

        finra();

    }



    /**
     * Finra pattern method, used do-while loop and if condition in it
     */
    public static void finra(){

        int r=30;
        int number=1;

        do {

            if (number%3==0 && number%5==0){
                System.out.print("FINRA ");
            } else if (number%5==0) {
                System.out.print("RA ");
            } else if (number%3==0) {
                System.out.print("FIN ");
            } else {
                System.out.print(number + " ");
            }

            number++;

        } while (number<=r);


    }
}
