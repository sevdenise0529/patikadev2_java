import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int adim, n = 1, n2 = 1, n3;
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayisini girin: ");
        adim = inp.nextInt();

        for (int i = 1; i <=adim; i++) {
            if (i == 1 || i == 2) {
                System.out.print("1 ");

            } else {
                n3 = n + n2;
                System.out.print(n3 + " ");
                n = n2;
                n2 = n3;
            }
        }

    }

}
