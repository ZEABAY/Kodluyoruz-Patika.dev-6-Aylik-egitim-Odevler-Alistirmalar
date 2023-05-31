import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r;

        System.out.println("C(n,r) kombinasyonu için");

        System.out.print("n değerini girin : ");
        n = scan.nextInt();

        System.out.print("r değerini girin : ");
        r = scan.nextInt();

        int result = factorial(n) / ((factorial(r) * factorial(n - r)));

        System.out.println("C(" + n + "," + r + ") =" + result);
    }

    public static int factorial(int number) {

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}