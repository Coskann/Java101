import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double b,k,index;
	Scanner scan=new Scanner(System.in);
	System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
	b= scan.nextDouble();
	System.out.println("Lütfen kilonuzu giriniz :");
	k= scan.nextDouble();
	index=(k/(b*b));
	System.out.println("Vücut Kitle İndeksiniz :"+index);
    }
}
