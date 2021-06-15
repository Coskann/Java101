import java.util.Scanner;

public class flightTicket101 {

    public static void main(String[] args) {
        //km birim fiyatı : 0.10Tl
        //12 yaşından küçükse toplam fiyata %50 indirim
        //12-24 yaş arası %10 indirim
        //65 yaşından büyükse %30 indirim
        //Gidiş-Dönüş alırsa %20 indirim
        //Bu koşullara göre uçak bileti hesaplayan program
        int km, age, tip;
        Scanner input = new Scanner(System.in);
        System.out.println("Kilometre giriniz :");
        km = input.nextInt();
        System.out.println("Yaş giriniz :");
        age = input.nextInt();
        System.out.println("Uçuş Tipi Giriniz :\n1-Tek Gidiş  \n2-Gidiş-Dönüş");
        tip = input.nextInt();
        double toplam, indirimli;
        if (km > 0 && age > 0 && (tip == 1 || tip == 2)) {
            System.out.println("Girdileriniz İçin Teşekkürler");
            toplam = km * 0.10;
            if (age >= 12 && age <= 24 && tip == 1) {

                indirimli = toplam - toplam * 0.10;
                System.out.println("Toplam Ücret" +indirimli);
            } else if (age < 12 && tip == 1) {

                indirimli = toplam - toplam * 0.50;
                System.out.println("Toplam Ücret" +indirimli);
            } else if (age >= 65 && tip == 1) {

                indirimli = toplam - toplam * 0.30;
                System.out.println("Toplam Ücret" +indirimli);
            } else if (age < 12 && tip == 2) {

                indirimli = toplam - toplam * 0.50 * 0.20;
                System.out.println("Toplam Ücret" +indirimli);
            } else if (age >= 65 && tip == 2) {

                indirimli = toplam - toplam * 0.30 * 0.20;
                System.out.println("Toplam Ücret" +indirimli);

            }else if(age >= 12 && age <= 24 && tip == 2){
                indirimli=(toplam- toplam*0.10*0.20)*2;
                System.out.println("Toplam Ücret" +indirimli + "$");
            }
            else {
                System.out.println("Girdilerinizi Kontrol Ediniz!");

            }


        }


    }
}

