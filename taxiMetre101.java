import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double km,kmtutar=2.20,geneltutar;
	System.out.println("Kilometre Giriniz :");
	km= scan.nextDouble();
	geneltutar=(km*kmtutar)+10;
	geneltutar=(geneltutar<20) ? 20 : geneltutar;
	System.out.println("Genel Tutar : "+geneltutar);

    }
}
