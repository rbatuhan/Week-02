import java.util.Scanner;

public class Main {

    // Metot
    static  int power(int a , int b){

        int result =1;

        for (int i = 1; i <= b; i++){
            result *=a;
        }
        return result;
    }
    public static void main(String[] args) {

        //Kullanıcıdan Taban ve ÜS değerini alma;

        Scanner inp=new Scanner(System.in);

        System.out.print("Taban Değerini Giriniz : ");
        int a= inp.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        int b= inp.nextInt();

        //Metot çağırma;
        int result = power(a, b);

        System.out.println("Sonuç : " + result);
    }
}