import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println(Arrays.toString(arr));
        System.out.println(" ");

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int sayac = 0;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                sayac++;
                i++;
            }
            sayac++;
            System.out.println(arr[i] + " Sayısı " + sayac + " kere tekrar edildi.");
        }

    }
}