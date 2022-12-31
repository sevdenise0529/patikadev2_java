import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int eleman = input.nextInt();
        fibonacci(eleman);
    }
    public static void fibonacci(int num){
        int n = 1, n2 = 1, n3;
        for (int i = 1; i <= num; i++){
            if (i == 1 || i == 2){
                System.out.print("1 ");
            }
            else{
                n3 = n + n2;
                System.out.print(n3 + " ");
                n = n2;
                n2 = n3;
            }
        }
    }
}