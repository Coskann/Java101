import java.util.Scanner;

public class artikYil101 {

    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.print("Yıl Bilgisi giriniz :");
        year = scan.nextInt();
        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println(year+" "+"bir artık yıldır.");
        } else {
            System.out.println(year+" "+"bir artık yıl değildir..");
        }

    }
}
