import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Declared Scanner Class
        Scanner input = new Scanner(System.in);

        //Get inputs from user
        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();


        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();


        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();


        System.out.print("Tarih notunuz : ");
        tarih = input.nextInt();


        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        float average = (mat + fizik + kimya + turkce + tarih + muzik) / 6f;

        String status = average > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.printf("\nOrtalmanız = %.2f\n" + status, average);
    }
}