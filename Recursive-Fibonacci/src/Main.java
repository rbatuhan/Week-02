public class Main {
    static int fib(int number) {
        // number 1 veya 2 olması durumunda döndürme
        if (number == 1 || number == 2)
            return 1;

        // fibonaccş formülü
        return fib(number - 1) + fib(number - 2);
    }
    public static void main(String[] args) {
        // örnek olarak fibonacci 6. serisi
        System.out.println(fib(6));
    }
}