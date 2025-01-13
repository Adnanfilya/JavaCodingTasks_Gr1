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
      }

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
