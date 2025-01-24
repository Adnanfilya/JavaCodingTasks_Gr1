package selim;

public class Task03_SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("before swap a = " + a);
        System.out.println("before swap b = " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap a = " + a);
        System.out.println("After swap b = " + b);
    }
}
class Task03_withoutTemp{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("before swap a = " + a);
        System.out.println("before swap b = " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swap a = " + a);
        System.out.println("after swap b = " + b);
    }
}
