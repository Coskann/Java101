import java.util.Scanner;

public class desenMetot {

    static void hesapla(int sayi){
        int temp = sayi;
        System.out.println(temp);
        while(temp>0){
            System.out.println(temp -= 5);
            if(temp<=0){
                System.out.println(temp -= 5);
                temp = sayi;
                System.out.println(sayi);
                break;
            }
            }

        }


    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        i= sc.nextInt();
        System.out.println("================");
        hesapla(i);
    }
}