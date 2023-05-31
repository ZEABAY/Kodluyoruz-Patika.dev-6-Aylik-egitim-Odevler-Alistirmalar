import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int distance, age, type;
        double total;
        Scanner scan = new Scanner(System.in);


        System.out.print("Mesafeyi KM türünden giriniz : ");
        distance = scan.nextInt();

        System.out.print("Yaşınızı girin : ");
        age = scan.nextInt();

        System.out.println("Yolculuk tipini giriniz \n1 => Tek Yön \n2 => Gidiş Dönüş :  ");
        type = scan.nextInt();

        if (!(distance > 0 && age > 0 && (type == 1 || type == 2))) {

            System.out.println("Hatalı Veri Girdiniz Tekrar Deneyin");
            return;

        }


        total = distance * 0.10;
        System.out.println(total);


        if (age < 12) {
            total = total * 0.5;
            System.out.println(total);
        } else if (age >= 12 && age <= 24) {
            total = total * 0.9;
            System.out.println(total);
        } else if (age > 65) {
            total = total * 0.7;
            System.out.println(total);
        }
        if (type == 2) {
            total = (total * 0.8);
        }
        total = total * type;

        System.out.println("Toplam Tutar : " + total);

    }
}