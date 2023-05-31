import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi girin : ");
        int n = scan.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count += i;
            }
        }

        System.out.println(count == n ? n + " Sayısı bir mükemmel sayıdır" : n + " Sayısı bir mükemmel sayı değildir");
    }
}