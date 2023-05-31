import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables
        int mat, fizik, kimya, turkce, muzik, dersSayisi = 5;

        //Declared Scanner Class
        Scanner input = new Scanner(System.in);

        //Get inputs from user
        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            mat = 0;
            dersSayisi--;
        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            dersSayisi--;
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
            dersSayisi--;
        }

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
            dersSayisi--;
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            dersSayisi--;
        }

        float average = (mat + fizik + kimya + turkce + muzik) / dersSayisi;


        String status = average >= 55 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.printf("\nOrtalmanız = %.2f\n" + status, average);

    }
}