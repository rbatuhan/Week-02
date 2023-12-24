import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        
        for (int i : arr) {
            if (i == value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int[] list = {5, 9, 11, 11, 6, 17, 8, 27, 19, 6, 16, 8, 16, 27, 2, 2,};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println("Dizi: "+Arrays.toString(list) );
        System.out.println("\nTekrar eden sayılar");

        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println("\nTekrar eden çift sayılar");
        for (int value : duplicate) {
            if (value != 0 && value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
    }
}