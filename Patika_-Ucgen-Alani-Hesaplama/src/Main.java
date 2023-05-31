import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci kenar :");
        a = scan.nextInt();

        System.out.print("İkinci Kenar : ");
        b = scan.nextInt();

        System.out.print("Üçüncü Kenar : ");
        c = scan.nextInt();

        double u = (a + b + c) / 2;
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı : " + area);
    }
}