package adnan;
// Write a return method that can find the frequency of characters
//Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2v

public class T05_FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(findFrequancy("aabbbcccbb"));
    }

    /**
     * method that can find the frequency of characters
     *
     * @param str
     * @return
     */

    public static String findFrequancy(String str) {


        String result = "";


        for (int i = 0; i <= str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            for (int j = 0; j <= str.length() - 1; j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }


            // System.out.println(currentChar);
//            if (str.indexOf(currentChar) == i) {
//                result += currentChar + "" + count;
//
//            }

            // Eğer karakter zaten result'ta varsa, işlemi atla.
            //Metod 1
            if (result.contains(String.valueOf(currentChar))) {
            continue;
            }
            //Metod 2
            //karakterin daha önce eklenip eklenmediğini kontrol etmek için
            // result.indexOf(currentChar) == -1 kullanmalısın.(chatGPT:)))

            if (result.indexOf(currentChar) == -1){
                result += currentChar + "" + count;
            }



        }
        return result;
    }
}
