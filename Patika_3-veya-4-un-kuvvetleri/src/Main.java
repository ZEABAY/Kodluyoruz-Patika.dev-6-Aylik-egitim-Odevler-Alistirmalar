import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input, count = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");

        input = scan.nextInt();
        for (int i = 1, j = i; i <= input; i *= 4) {
            System.out.println("4 ün " + count + ".kuvveti" + " " + i);
            if (j == j * 5) {
                System.out.println("5 in " + count + ".kuvveti" + " " + (j *= 5));
            }
            count++;
        }
    }
}