package selim;

public class Task02Finra {
    public static void main(String[] args) {
        for(int i=1;i<=30;i++){
            if(i%3==0 && i%5==0){
                System.out.print("FinRa" +" ");
            } else if (i%3==0) {
                System.out.print("Fin" + " ");

            } else if (i%5==0) {
                System.out.print("Ra" + " ");

            }else{
                System.out.print(i + " ");
            }

        }

    }
}
