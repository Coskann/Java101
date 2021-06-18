import java.util.Scanner;

public class reverse101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        Character c;

        System.out.println("Yükseklik Giriniz : ");
        size = sc.nextInt();

        System.out.println("Hangi karakter kullanmak istersiniz : ");
        c = sc.next().charAt(0);

        int i, j, k;

        for (i = size; i > 0; i--) {
            for (j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < (i * 2 - 1); k++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

}