import java.util.Scanner;

public class Main {
    static void Check(int n) {
        int counter = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println(n + " ");
        }

    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            Check(i);
        }
    }
}