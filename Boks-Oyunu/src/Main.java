public class Main {
    public static void main(String[] args){

        Fighter f1 = new Fighter("A", 15, 100, 100, 30);
        Fighter f2 = new Fighter("B", 20, 100, 85, 30);

        Match match = new Match(f1,f2,85,100);
        match.run();

    }
}