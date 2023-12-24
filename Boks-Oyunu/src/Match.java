import java.util.Random;
public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run(){
        if (isCheck()){
            boolean firstFighterStarts = new Random().nextBoolean();

            if (firstFighterStarts) {
                System.out.println(this.f1.name + " ilk dövüşe başlıyor!");
            } else {
                System.out.println(this.f2.name + " ilk dövüşe başlıyor!");
            }

            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("===== YENİ ROUND =====");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }

                this.f1.health = this.f2.hit(this.f1);
                if (isWin()){
                    break;
                }

                System.out.println(this.f2.name + " KALAN SAĞLIK " + this.f2.health);
                System.out.println(this.f1.name + " KALAN SAĞLIK " + this.f1.health);
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor. ");
        }
    }

    boolean isCheck(){
        return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    boolean isWin(){
        if (this.f1.health == 0 ){
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }
        if (this.f2.health == 0 ){
            System.out.println(this.f1.name + " kazandı !");
            return  true;
        }
        return false;
    }
    // Başlama olasılığı
    boolean isFighter(){
        double randomFight = Math.random() * 100;
        return randomFight > 50;
    }
}
