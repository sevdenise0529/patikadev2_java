import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        select = scan.nextInt();
        switch (select) {
        case 1:
            sum();
            break;
        case 2:
            minus();
            break;
        case 3:
            multiplication();
            break;
        case 4:
            division();
            break;
        case 5:
            power();
            break;
        case 6:
            faktoriyel();
            break;
        case 7:
            mod();
            break;
        case 8:
            alanCevre();
            break;
        case 0:
            System.out.println("Tekrar Görüşmek Üzere");
            break;
        default:
            System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            break;
            }
        }
    public static void sum(){
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true){
            System.out.print(i++ + ".sayı: ");
            number = scan.nextInt();
            if (number == 0){
                break;
            }
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }
    public static void minus(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int counter = scan.nextInt();
        int number, result = 0;
        for (int i = 1; i<= counter; i++){
            System.out.print(i + ".sayı: ");
            number = scan.nextInt();
            if (i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç: " + result);
    }
    public static void multiplication(){
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true){
            System.out.println(i++ + ".sayı: ");
            number = scan.nextInt();
            if (number == 1){
                break;
            }
            if (number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç: " + result);
    }
    public static void division(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int counter = scan.nextInt();
        double number, result = 1;
        for (int i = 1; i <= counter; i++){
            System.out.print(i + ".sayı: ");
            number = scan.nextDouble();
            if (i != 0 && number == 0){
                System.out.println("Böleni 0 giremezsiniz");
                continue;
            }
            if (i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç: " + result);
    }
    public static void power(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int taban = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int us = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= us; i++){
            result *= taban;
        }
        System.out.println("Sonuç: " + result);
    }
    public static void faktoriyel(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }
    public static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        int num = scan.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        int num2 = scan.nextInt();
        int result = num % num2;
        System.out.println("Sonuç: " + result);
    }
    public static void alanCevre(){
        Scanner scan = new Scanner(System.in);
        System.out.print("A kenarı giriniz: ");
        int num = scan.nextInt();
        System.out.print("b kenarı giriniz: ");
        int num2 = scan.nextInt();
        int alan = num * num2;
        int cevre = 2*(num + num2);
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }
}