import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pricePerKM = 2.20;
        int MIN_PRICE = 20;
        int start = 10;
        double distance;
        double total;


        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        Scanner scan = new Scanner(System.in);
        distance = scan.nextDouble();

        total = start + distance * pricePerKM;
        total = total <= 20 ? 20 : total;
        System.out.println("Toplam Tutar = " + total);
    }
}