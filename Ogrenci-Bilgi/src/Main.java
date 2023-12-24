public class Main {
    public static void main(String[] args){
        Teacher t1 = new Teacher("Mahmut Hoca" , "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell" , "FZK", "666");
        Teacher t3 = new Teacher("Külyutmaz" , "BIO", "777");


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(60,100,70,75,60,95);
        s1.isPass();
        Student s2 = new Student("Şaban", "1234", "5", tarih, fizik, biyo);
        s2.addBulkExamNote(50,20,40,35,40,55);
        s2.isPass();
    }
}