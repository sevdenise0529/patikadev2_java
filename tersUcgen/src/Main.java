import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı: ");
        int n = input.nextInt();
        for (int i= n;i>=1; i--){
            for (int a=0; a<n-i;a++){
                System.out.print(" ");
            }
            for (int b=2*i-1;b>0; b--){
                System.out.print("*");

            }
            System.out.println();

        }
    }
}