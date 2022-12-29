import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("n1 sayısını giriniz:");
        int n1= input.nextInt();
        System.out.print("n2 sayısını giriniz:");
        int n2= input.nextInt();
        int ebob=1;

        if(n1>=n2){
            int i=1;
            while(i<=n2){
                i++;
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                }
            }
            System.out.print("EBOB:"+ebob);
        }
        else{
            for(int i=1;i <= n1;i++){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                }
            }
            System.out.print("EBOB:"+ebob);
        }
        int ekok=1;
        for(int i=1;i <= (n1*n2);i++){
            if(i%n1==0 && i%n2==0){
                ekok=i;
                System.out.println("\nEKOK:"+ekok);
                break;
            }
        }
    }
}