import java.util.Scanner;

public class desenMetot {

    static void calc(int sayi) {
        int temp = sayi;
        System.out.print(temp);
        while (temp > 0) {
            System.out.print("\t"+(temp -= 5));
        }
        while (temp <= sayi) {
            System.out.print("\t"+(temp += 5));
            if (temp == sayi) {
                break;
            }


        }

    }


    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        i = sc.nextInt();
        System.out.println("================");
        calc(i);
    }
}