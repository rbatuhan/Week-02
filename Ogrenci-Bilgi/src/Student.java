public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note1s, int note2, int note2s, int note3, int note3s) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (note1s >= 0 && note1s <= 100) {
            this.c1.noteS = note1s;
        }
        if (note2s >= 0 && note2s <= 100) {
            this.c2.noteS = note2s;
        }
        if (note3s >= 0 && note3s <= 100) {
            this.c3.noteS = note3s;
        }
    }

        void isPass(){
            System.out.println("========================================");
            double n1 = this.c1.note * 0.80 + this.c1.noteS * 0.20;
            double n2 = this.c2.note * 0.80 + this.c2.noteS * 0.20;
            double n3 = this.c3.note * 0.80 + this.c3.noteS * 0.20;
            this.avarage = (n1 + n2 + n3) / 3.0;
            if (this.avarage > 55) {
                System.out.println("Hababam Sınıfı Uyanıyor ! ");
                this.isPass = true;

            } else {
                System.out.println("Hababam Sınıfı Sınıfta Kaldı !");
                this.isPass = false;
            }

            printNote();
        }
        void printNote(){
        System.out.println(this.c1.name + " Notu =\t" + this.c1.note);
        System.out.println(this.c2.name + " Notu =\t" + this.c2.note);
        System.out.println(this.c3.name + " Notu =\t" + this.c3.note);
        System.out.println(this.c1.name + " Sözlü Notu =\t" + this.c1.noteS);
        System.out.println(this.c2.name + " Sözlü Notu =\t" + this.c2.noteS);
        System.out.println(this.c3.name + " Sözlü Notu =\t" + this.c3.noteS);
        System.out.println("Ortalamanız : " + this.avarage);
    }
}