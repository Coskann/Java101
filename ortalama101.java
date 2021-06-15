import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik;
        System.out.println("Matematik Notu ;");
        matematik = scan.nextInt();
        System.out.println("Fizik Notu ;");
        fizik = scan.nextInt();
        System.out.println("Kimya Notu ;");
        kimya = scan.nextInt();
        System.out.println("Türkçe Notu ;");
        turkce = scan.nextInt();
        System.out.println("Tarih Notu ;");
        tarih = scan.nextInt();
        System.out.println("Müzik Notu ;");
        muzik = scan.nextInt();
        int ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamanız : "+ortalama);
        String sonuc = (ortalama>=60) ? "Sınıfı Geçti" : "Kaldınız";
        System.out.println("Sonuç : "+sonuc);
        }




    }
