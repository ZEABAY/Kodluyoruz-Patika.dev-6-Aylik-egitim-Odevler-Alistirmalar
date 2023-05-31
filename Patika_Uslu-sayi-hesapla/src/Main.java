import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r;

        System.out.println("n^r için");

        System.out.print("n değerini girin : ");
        n = scan.nextInt();

        System.out.print("r değerini girin : ");
        r = scan.nextInt();

        int result = 1;

        for (int i = 1; i <= r; i++) {
            result *= n;

        }


        System.out.println(n + "^" + r + "=" + result);
    }

}