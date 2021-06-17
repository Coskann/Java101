import java.util.Scanner;

public class harmonik101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = scanner.nextInt();
        double result = 0,j,i;

        for (i = 1; i <= number; i++) {
            j=1/i;
            result+=j;
        }
        System.out.println("Harmonik Seri Sonucu: "+result);
    }
}
