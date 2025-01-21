package mustafa;
public class Task01_OddOrEven {

    /*
Write a method that can identify  a given number is even or odd.
     EX:
            identify(5) --> "Odd"
            identify(6) --> "Even"
   */
    public static void main(String[] args) {
        System.out.println("identify(5) = " + identify(6));
        System.out.println("identify(6) = " + identify(15));
        System.out.println("identify(-1) = " + identify(-1));

    }
    /**
     *
     * @param number
     * İs identify the n is even or odd
     * İs identify the n  even or odd
     */

    public static String identify(int number) {
        if(number<0){
            System.err.println("number can not be negative");
        }
        if (number % 2 == 0) {
            return "Even";
        }else {
            return "Odd";
        }
    }
}