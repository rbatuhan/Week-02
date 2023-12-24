import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int length = input.nextInt();

        int[] list = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print(i + 1 + ".Elemanı : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("\nSıralama : " + Arrays.toString(list));
    }
}