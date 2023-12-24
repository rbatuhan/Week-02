public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double incrase;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }



    //Vergi kontrol
    public void tax(){
        if (this.salary > 1000) {
            this.tax= (this.salary * 0.03);
            System.out.println("Vergi: " + this.tax);

        }
        else {
            this.tax = 0;
            System.out.println("Vergi: " + this.tax);
        }
    }

    //Bonus Hesabı
    public void bonus(){
        if (this.workHours > 40){
            this.bonus= ((this.workHours - 40) * 30);
            System.out.println("Bonus: " + this.bonus);

        }
        else {
            this.bonus = 0;
            System.out.println("Bonus : " + this.bonus);
        }
    }

    // Maaş Artışı
    public void raiseSalary(){
        if (this.hireYear >= 20) {
            this.incrase = (0.15 * this.salary);
            System.out.println("Çalışanın maaş artışı: " + this.incrase);
        } else if (this.hireYear >= 10 && this.salary < 20) {
            this.incrase = (0.10 * this.salary);
            System.out.println("Çalışanın maaş artışı: " + this.incrase);
        } else if (this.hireYear < 10) {
            this.incrase = (0.05 * this.salary);
            System.out.println("Çalışanın maaş artışı: " + this.incrase);

        }
    }

    public void infoPrint(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        tax();
        bonus();
        raiseSalary();

        this.salary += (bonus - tax);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + salary);

        this.salary += incrase;
        System.out.println("Toplam Maaş: " + this.salary);
    }
}