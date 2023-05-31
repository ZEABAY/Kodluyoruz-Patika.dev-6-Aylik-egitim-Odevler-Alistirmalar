import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int min;
        int max;
        int temp;
        int i;

        System.out.print("Kaç Sayı Gireceksiniz ? : ");
        i = scan.nextInt();

        System.out.print("1. Sayıyı girin : ");
        min = scan.nextInt();
        max = min;
        while (count < i) {
            System.out.print((count + 1) + ". Sayıyı girin : ");
            temp = scan.nextInt();

            if (temp > max) {
                max = temp;
            }

            if (temp < min) {
                min = temp;
            }

            count++;
        }

        System.out.println("En Küçük Sayı = " + min + " En Büyük Sayı = " + max);

    }
}