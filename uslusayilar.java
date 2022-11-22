import java.util.Scanner;;

public class uslusayilar {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        int k = scan.nextInt();
        System.out.print("Üs olacak sayı: ");
        int m = scan.nextInt();
        int sonuc = 0;
        for (int i=1; i<=m; i++){
            sonuc*=k;
        }
            System.out.println("Sonuç: "+sonuc);
        }

}
