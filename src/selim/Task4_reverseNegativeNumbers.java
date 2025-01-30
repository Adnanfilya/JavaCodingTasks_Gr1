package selim;

public class Task4_reverseNegativeNumbers {
        /*
        Write a return method that can reverse digits of a negative number and return it as int
        input: -35  output: -53
         */
        public static void main(String[] args) {
            int n = -35;
            System.out.println("original number is = " + n);
            int reversedNumber = reverseNegativeNumbers(n);
            System.out.println("reversed number is = " + reversedNumber);
        }
        /**
         *
         * @param number must be negative
         * @return reverseNegativeNumber
         */
        public static int reverseNegativeNumbers(int number) {

            if (number > 0){
                System.out.println("number can't be positive for this method");
            }
            int reversed=0;
            if (number <0) {
                int lastDigits = number*(-1)%10;
                int firstDigits = -number/10;
                reversed = lastDigits*10 + firstDigits;
            }
            return -reversed;
        }
    }



