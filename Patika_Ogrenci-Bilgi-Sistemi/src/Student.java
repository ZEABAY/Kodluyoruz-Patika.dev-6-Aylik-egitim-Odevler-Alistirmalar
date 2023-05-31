public class Student {

    Course course1;
    Course course2;
    Course course3;


    String name;
    String stNo;
    String classes;
    double averagge;
    boolean isPass;

    public Student(String name, String stNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stNo = stNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.averagge = 0.0;
        this.isPass = false;
    }


    void addBulkExamNote(int examNote1, int verbalNote1, int examNote2, int verbalNote2, int examNote3, int verbalNote3) {


        double note1 = (examNote1 * 0.8) + (verbalNote1 * 0.2);
        double note2 = (examNote2 * 0.8) + (verbalNote2 * 0.2);
        double note3 = (examNote3 * 0.8) + (verbalNote3 * 0.2);

        if (note1 >= 0 && note1 <= 100) {
            course1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            course2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            course3.note = note3;
        }

    }

    public void isPass() {
        this.averagge = (this.course1.note + this.course2.note + this.course3.note) / 3.0;
        System.out.println("Ortalama : " + averagge);

        if (averagge > 55) {
            System.out.println("Hababam sınıfı uyanıyor");
            this.isPass = true;
        } else {
            System.out.println("Hababam sınıfı kaldı");
            this.isPass = false;
        }
        System.out.println("-------------");
        printNote();
        System.out.println("=============");

    }

    public void printNote() {
        System.out.println(this.course1.name + " Notu\t: " + this.course1.note);
        System.out.println(this.course2.name + " Notu\t: " + this.course2.note);
        System.out.println(this.course3.name + " Notu\t: " + this.course3.note);
    }

}

