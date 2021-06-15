import java.util.Scanner;

public class manavKasa101 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, e, d, m, p;
        System.out.print("Armut Miktarını Giriniz :");
        a= scan.nextDouble();
        System.out.print("Elma Miktarını Giriniz :");
        e= scan.nextDouble();
        System.out.print("Domates Miktarını Giriniz :");
        d= scan.nextDouble();
        System.out.print("Muz Miktarını Giriniz :");
        m= scan.nextDouble();
        System.out.print("Patlıcan Miktarını Giriniz :");
        p= scan.nextDouble();
        double toplamTutar = (a*2.14+e*3.67+d*1.11+m*0.95+p*5);
        System.out.print("Toplam Tutar : "+toplamTutar+ "TL");
    }
}
