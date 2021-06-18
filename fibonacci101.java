import java.lang.reflect.Array;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Scanner;

public class fibonacci101 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int numb = scanner.nextInt();
        int i = 0, count = 0;
        int a = 1, b = 0;
        int plus;
        while (i < numb) {
            plus = a + b;
            System.out.println(b + " + " + a + " = " + plus);
            b = a;
            a = plus;
            i++;
        }
    }
}