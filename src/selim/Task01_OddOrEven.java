package selim;

public class Task01_OddOrEven {

        /*
  Write a method that can identify  a given number is even or odd.
         EX:
                identify(5) --> "Odd"
                identify(6) --> "Even"
       */
        public static void main(String[] args) {
            System.out.println("identify(5) = " + identify(5));
            System.out.println("identify(6) = " + identify(6));
            System.out.println("identify(-1) = " + identify(-1));

        }
        /**
         *
         * @param n
         * İs identify the n is even or odd
         * İs identify the n  even or odd
         */

        public static String identify(int n) {
            if(n<0){
                System.err.println("num can not be negative");
            }
            if (n % 2 == 0) {
                return "Even";
            }else {
                return "Odd";
            }
        }
    }

