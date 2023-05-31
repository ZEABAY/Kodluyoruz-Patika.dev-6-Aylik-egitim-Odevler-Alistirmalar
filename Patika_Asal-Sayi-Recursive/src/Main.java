import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        //sayı 2 den küçük ise kontrole gerek yok sayı asal olamaz
        if (number < 2) {
            System.out.println(number + " bir asal sayı değildir");
            return;
        }

        //Sayının kendisi hariç en büyük böleni yarısından büyük olamaz o yüzden fazla kontrolü engellemek içnin kontrole yarısından başlanmalı
        prime(number, number / 2);

    }

    public static void prime(int number, int div) {
        if (div == 1) {
            System.out.println(number + " bir asal sayıdır");
            return;
        }

        if (number % div == 0) {
            System.out.println(number + " bir asal sayı değildir");
        } else {
            prime(number, div - 1);
        }
    }
}