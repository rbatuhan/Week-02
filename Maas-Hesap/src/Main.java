import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen çalışanın adı ve soyadını giriniz: ");
        String name = input.nextLine();

        System.out.print("Lütfen çalışanın maaşını giriniz: ");
        double salary = input.nextDouble();

        while (salary < 0){
            System.out.print("HATA! Yeni Maaşı Giriniz: ");
            salary = input.nextDouble();
        }

        System.out.print("Lütfen çalışanın haftalık çalışma saatini giriniz: ");
        int workHours = input.nextInt();

        while (workHours < 0){
            System.out.print("HATA! Yeni Çalışma Saati Giriniz: ");
            workHours = input.nextInt();
        }

        System.out.print("Lütfen çalışanın işe başlangıç yılını giriniz: ");
        int hireYear = input.nextInt();

        while (hireYear > 2022){
            System.out.print("HATA! Yeni Yıl Giriniz: ");
            hireYear = input.nextInt();
        }

        System.out.println("=================================");

        Employee maas = new Employee(name, salary, workHours, hireYear);

        maas.infoPrint();

    }
}