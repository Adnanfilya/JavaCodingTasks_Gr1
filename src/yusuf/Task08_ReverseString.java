package yusuf;

public class Task08_ReverseString {

    public static void main(String[] args) {

        System.out.println(reverse("java"));
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
