package sultan;

public class Task02_Finra {

    /*
    Write a function that prints out the numbers from 1 to 30 but for numbers that are a multiple of 3,
    print "FIN" instead of the number, and for numbers that are a multiple of 5, print "RA" instead of the number.
    For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    
    public static void main(String[] args) {

        finra();


    }

    /**
     * Finra task till number 30
     */
    public static void finra(){

        int number = 15;

        if (number%3==0 && number%5==0){
            System.out.println("FINRA");
        } else if (number%5==0) {
            System.out.println("RA");
        } else if (number%3==0) {
            System.out.println("FIN");
        } else {
            System.out.println("Wrong entry, try again!");
        }

    }

}
