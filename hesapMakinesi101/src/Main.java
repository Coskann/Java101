import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double n1, n2;
        int choosen;
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz :");
        n1 = scan.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz :");
        n2 = scan.nextDouble();
        System.out.println("Yapılacak İşlemi Seçiniz :\n 1)Toplama\n 2)Çıkarma\n 3)Bölme\n 4)Çarpma");
        choosen = scan.nextInt();

        switch (choosen) {
            case 1:
                System.out.println("Toplama İşleminin Sonucu : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma İşleminin Sonucu : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Bölme İşleminin Sonucu : " + (n1 / n2));
                break;
            case 4:
                System.out.println("Çarpma İşleminin Sonucu : " + (n1 * n2));
                break;


        }


    }
}
