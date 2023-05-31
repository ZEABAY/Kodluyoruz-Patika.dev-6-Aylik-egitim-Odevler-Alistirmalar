import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        double result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Girin : ");

        input = scan.nextInt();

        for (int i = 1; i <= input; i++) {
            result += 1.0 / i;
        }
        System.out.println("Sonuç : " + result);
    }
}