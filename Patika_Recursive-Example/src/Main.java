import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        prime(number, 1, number);

    }

    public static void prime(int number, int operator, int temp) {
        System.out.println(number);

        if (operator == 1) {
            number -= 5;
        } else {
            number += 5;
        }

        if (number <= 0) {
            operator = 0;
        }


        if (!(operator == 0 && number > temp)) {
            prime(number, operator, temp);
        }

    }
}