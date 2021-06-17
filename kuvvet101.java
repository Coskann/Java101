import java.util.Scanner;

public class kuvvet101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz :");
        int numb=scan.nextInt();
        System.out.print("4'ün kuvveti olan sayılar: ");
        for (int i=1; i<=numb;i*=4){
            System.out.print(i+" ");
        }System.out.println("\n");
        System.out.print("5'in kuvveti olan sayılar: ");
        for (int j=1; j<=numb ; j*=5){
            System.out.print(j+" ");
        }
    }
}
