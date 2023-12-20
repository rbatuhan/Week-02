import java.util.Scanner;

public class Main {

    //Metot
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan kontrol edilecek sayıyı isteme;

        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " sayısı ASALDIR !");
        }
        else {
            System.out.println(number + " sayısı ASAL değildir ! ");
        }
    }
}