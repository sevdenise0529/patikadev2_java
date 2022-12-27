import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

    for (int i = 0; i <= n ; i++) {
        for (int j = 0; j < (n - i); j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= (2 * i + 1); k++) {
            System.out.print("*");

        }
        System.out.println(" ");
    }
    for (int t = n-1; t >= 0 ; t--) {
        for (int c = 1; c <= (n - t); c++) {
            System.out.print(" ");
        }
        for (int g = 1; g <= (2 * t + 1); g++) {
            System.out.print("*");

        }
        System.out.println(" ");

    }

}
}