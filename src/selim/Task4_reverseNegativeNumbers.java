package selim;

public class Task4_reverseNegativeNumbers {
        /*
        Write a return method that can reverse digits of a negative number and return it as int
        input: -35  output: -53
         */
        public static void main(String[] args) {
            int n = -35;
            System.out.println("Original number is = " + n);
            int reversedNumber = reverseNegativeNumbers(n);
            System.out.println("Reversed number is = " + reversedNumber);

            n = -1234;
            System.out.println("Original number is = " + n);
            reversedNumber = reverseNegativeNumbers(n);
            System.out.println("Reversed number is = " + reversedNumber);
        }

    /**
     * @param number must be negative
     * @return reversed negative number
     */
    public static int reverseNegativeNumbers(int number) {
        if (number >= 0) {
            System.out.println("Error: number must be negative!");
            return 0; // Hatalı girişler için
        }

        int reversed = 0;
        number = -number; // Pozitife çeviriyoruz ki işlem yapabilelim

        while (number > 0) {
            int digit = number % 10; // Son basamağı al
            reversed = reversed * 10 + digit; // Yeni sayıyı oluştur
            number /= 10; // Son basamağı at
        }

        return -reversed; // Negatif işareti geri ekle
    }
}