import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int sayi = input.nextInt();
        int max = 0;
        int min = 0;
        for (int i = 1; i <= sayi; i++){
            System.out.print(i + ".Sayıyı giriniz: ");
            int n = input.nextInt();
            if (n > max){
                max = n;
            } else if (n < min) {
                min = n;
            }
        }
        System.out.println("En küçük sayınız: " + min);
        System.out.println("En büyük sayınız: " + max);
    }
}