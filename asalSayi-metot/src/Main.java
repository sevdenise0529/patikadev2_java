import java.util.Scanner;
public class Main {
    public static void asal(int sayi){
        int sayac = 0;
        if (sayi < 1){
            System.out.println("1 den buyuk sayilar, asal sayi olabilir");
        }
        else {
            for (int i = 1; i <= sayi; i++) {
                int kalan = sayi % i;
                if (kalan == 0) {
                    sayac++;
                }
            }
            if (sayac == 2) {
                System.out.println(sayi + " sayısı ASALDIR!");
            } else {
                System.out.println(sayi + " sayısı ASAL değildir!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        asal(sayi);
    }
}