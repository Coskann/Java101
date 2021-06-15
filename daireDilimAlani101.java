import java.util.Scanner;

public class daireDilimAlani101{

    public static void main(String[] args) {
	double r,a,pi=3.14;
	Scanner scan = new Scanner(System.in);
	System.out.print("Yarı Çapı Giriniz = ");
	r=scan.nextDouble();
	System.out.print("Merkez Açısının Ölçüsü =");
	a=scan.nextDouble();
	System.out.println("Daire Dilim Alanı :"+(pi*(r*r)*a)/360);


    }
}
