import java.util.Scanner;

public class basamakSayi101 {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        num= scan.nextInt();
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
    }
