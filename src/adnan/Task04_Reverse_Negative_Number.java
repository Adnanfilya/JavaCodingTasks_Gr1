package adnan;

public class Task04_Reverse_Negative_Number {

    public static void main(String[] args) {
        reverse(-5012);
    }

    /**
     * Using stringbuilder reverse an integer
     * @param num
     * @return
     */
    public static int reverse(int num) {

        if (num >= 0) {
            System.out.println("Number must be negative");
            return  0;
        }

        String reversedStr = new StringBuilder(String.valueOf(Math.abs(num))).reverse().toString();
        int reversed = Integer.parseInt(reversedStr);
        System.out.println(-reversed);
        return -reversed; // Restore negative sign
    }
}

