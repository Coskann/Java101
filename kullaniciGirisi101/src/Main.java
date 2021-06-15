import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kullanıciadi, sifre;
        System.out.println("Kullanıcı Adı : ");
        kullanıciadi = scan.nextLine();
        System.out.println("Şifreniz :");
        sifre = scan.nextLine();
        if(kullanıciadi.equals("admin")&& sifre.equals("admin")){
            System.out.println("Giriş Başarılı");

        }else{
            System.out.println("Kullanıcı Adı veya Şifre yanlış!");

        }

    }
}
