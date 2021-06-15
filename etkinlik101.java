import java.util.Scanner;

public class etkinlik101 {

    public static void main(String[] args) {
        double heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz :");
        heat = input.nextDouble();
        if (heat > 25) {
            System.out.println("Yüzme etkinliklerini öner");
        } else if (heat > 5 && heat < 15) {
            System.out.println("Sinema önerilir");
        } else if (heat < 5) {
            System.out.println("Kayma etkinlikleri önerilir.");
        } else if (10<heat&&heat<25) {
            System.out.println("Piknik Önerilir.");
        }
    }
}
