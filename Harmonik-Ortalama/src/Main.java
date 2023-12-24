
public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        double harmonikAvarage = 0.0;
        double harmonikS = 0.0;

        for (int i : arr) {
            harmonikS += ((double) 1 / i);
            harmonikAvarage = arr.length / harmonikS;
        }

        System.out.println(harmonikAvarage);

    }
}