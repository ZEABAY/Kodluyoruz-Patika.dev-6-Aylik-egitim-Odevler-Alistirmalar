import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00;
        double result = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? ");
        result += scan.nextDouble() * armut;


        System.out.print("Armut Kaç Kilo ? ");
        result += scan.nextDouble() * elma;

        System.out.print("Armut Kaç Kilo ? ");
        result += scan.nextDouble() * domates;

        System.out.print("Armut Kaç Kilo ? ");
        result += scan.nextDouble() * muz;

        System.out.print("Armut Kaç Kilo ? ");
        result += scan.nextDouble() * patlıcan;

        System.out.print("Toplam Tutar : " + result);
    }
}