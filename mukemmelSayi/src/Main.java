import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        int total = 0;
        for (int i = 1; i < num; i++){
            if (num % i==0){
                total += num;
            }
        }
        if (total == num){
            System.out.println(num + " Mükemmel sayıdır.");
        }
        else {
            System.out.println(num + " Mükemmel sayı değildir.");
        }
    }
}