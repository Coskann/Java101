import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tutar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Tutar Giriniz : ");
        tutar = scan.nextInt();
        if(tutar<1000&&tutar>0){
            System.out.println("KDV'siz Fiyat : " + tutar);
            double tutar1 = tutar * 0.18 + tutar;
            System.out.println("KDV'li Fiyat : " + tutar1);
            double kdv = tutar * 0.18;
            System.out.println("KDV tutarı : " + kdv);

        }
        if(tutar>1000){
            System.out.println("KDV'siz Fiyat : " + tutar);
            double tutar1 = tutar * 0.08 + tutar;
            System.out.println("KDV'li Fiyat : " + tutar1);
            double kdv = tutar * 0.08;
            System.out.println("KDV tutarı : " + kdv);

        } else{
            System.out.println("Tutar Tanımlanmadı.");
        }
    }

}
