import java.util.Scanner;

class recursivePrime101 {


    static boolean isPrime(int n, int i)
    {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }
    public static void main(String[] args)
    {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        n= scan.nextInt();

        if (isPrime(n, 2))
            System.out.print(n+" "+"sayısı ASALDIR !");
        else
            System.out.print(n+" "+"sayısı ASAL değildir !");
    }
}
