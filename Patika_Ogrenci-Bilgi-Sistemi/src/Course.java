public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    int examNote;
    int verbalNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;

        this.note = 0;
        this.examNote = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            //printTeacherInfo();
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }
    }

    void printTeacherInfo() {
        this.teacher.print();
    }
}
