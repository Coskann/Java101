import java.util.Scanner;

public class recursivePower101 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int base,powerRaised;
        System.out.print("Üssü alınacak sayıyı giriniz :");
        base = scan.nextInt();
        System.out.print("Üs giriniz :");
        powerRaised= scan.nextInt();

        int result = power(base, powerRaised);

        System.out.println("Sonuç :"+""+result);
    }

    public static int power(int base, int powerRaised) {

        if (powerRaised != 0)
        {
        return (base * power(base, powerRaised - 1));
        }
        else{
        return 1;
        }
    }
}
