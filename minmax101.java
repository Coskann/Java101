import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class minmax101 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Girmek İstediğiniz Sayı Adedini Giriniz: ");
                int amount = scanner.nextInt();
                int myArray[] = new int[amount];
                for (int i = 0; i < amount; i++) {
                    System.out.print((i + 1) + ". Sayıyı Giriniz: ");
                    int a = scanner.nextInt();
                    myArray[i] = a;
                }
                Arrays.sort(myArray);
                System.out.println("En Büyük: "+myArray[amount-1]);
                System.out.println("En Küçük: "+myArray[0]);
            }
        }
