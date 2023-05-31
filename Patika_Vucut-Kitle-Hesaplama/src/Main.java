import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Kilo (kg) / Boy(m) * Boy(m)
        double height, weight, result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        weight = scan.nextDouble();

        result = weight / (height * height);

        System.out.println("Vücut Kitle İndeksiniz : " + result);
    }
}