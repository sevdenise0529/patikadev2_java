import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Palindrom sayısı için bir sayı girin: ");
        int sayi = input.nextInt();
        PalindromSayisi(sayi);
    }

    public static void PalindromSayisi(int num) {
        int temp = num, reverseNum = 0, lastNum;
        while (temp != 0) {
            System.out.println("===========");
            System.out.println("Sayı => " + temp);

            lastNum = temp % 10;
            System.out.println("Son Basamak => " + lastNum);

            reverseNum = (reverseNum * 10) + lastNum;
            System.out.println("Yeni Sayi => " + reverseNum);

            temp /= 10;
            System.out.println("Yeni Temp => " + temp);
        }
        if (num == reverseNum) {
            System.out.println(num + " Palindrom sayisidir.");
        }
        else{
            System.out.println(num + " Palindrom sayisi değildir.");
        }

    }
}