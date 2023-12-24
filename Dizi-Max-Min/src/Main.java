import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2,0};

        System.out.println(Arrays.toString(list));

        int max = list[0];
        int min = list.length - 1;

        Scanner input = new Scanner(System.in);

        System.out.print("0  ile " + (list.length - 1) + " aralığında bir sayı giriniz : ");
        int num = input.nextInt();

        int closerLow = 0;
        int closerHigh = 0;
        for (int i = 0; i <= num + 1; i++){

            closerLow = list[num - 1];
            closerHigh = list[num + 1];
        }
        System.out.println("Seçtiğiniz sayı : " + list[num]);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + closerLow);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + closerHigh);

    }
}