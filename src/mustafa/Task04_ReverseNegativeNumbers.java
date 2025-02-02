package mustafa;

public class Task04_ReverseNegativeNumbers {
    /*
       Write a return method that can reverse digits of a negative number and return it as int
       input: -35  output: -53
        */
    public static void main(String[] args) {
        int input =-35;
        int output=reverseNumber(input);

        System.out.println("input: "+input+" output: "+output);}


    /**
     *
     * @param input Reverse Digit Return Method for negative number with int return type.
     *
     */
public static int reverseNumber(int input) {

if (input >=0){
    System.err.println("input value must be a negative number.");
    return 0; }

else{
    String intToStr = String.valueOf(input);

    String reversStr ="";

    for (int i = intToStr.length()-1; i >0 ; i--){
        reversStr += intToStr.charAt(i);}
    int reversInt =Integer.parseInt(reversStr);
    return reversInt*-1;}


}}



