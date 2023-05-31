import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini girin: ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini girin: ");
        int power = scanner.nextInt();

        int sonuc = exp(base, power);
        System.out.println("Sonuç: " + sonuc);
    }

    public static int exp(int base, int power) {
        if (power == 0) {
            return 1;
        } else {
            return base * exp(base, power - 1);
        }
    }
}