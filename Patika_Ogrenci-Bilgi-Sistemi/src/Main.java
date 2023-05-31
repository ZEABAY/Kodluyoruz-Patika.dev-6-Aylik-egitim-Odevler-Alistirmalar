public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "111", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "222", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "333", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Inek Şaban", "123", "4", tarih, fizik, biyo);

        //ders1 sözü , ders1 sınav --   ders2 sözü , ders2 sınav --   ders3 sözü , ders3 sınav
        s1.addBulkExamNote(90, 90, 20, 20, 78, 50);
        s1.isPass();

    }
}