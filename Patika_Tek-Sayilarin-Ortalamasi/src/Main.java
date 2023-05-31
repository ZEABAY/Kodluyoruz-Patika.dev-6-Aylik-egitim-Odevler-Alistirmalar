import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Çıkış için negatif sayı girin");
        System.out.print("Bir sayı giriniz : ");
        int input = scan.nextInt();
        int count = 0;
        int average = 0;
        if (input % 4 == 0) {
            average = input;
            count++;
        }

        System.out.println(average + "  " + count);
        while (input >= 0) {
            System.out.print("başka bir sayı giriniz : ");
            input = scan.nextInt();
            if (input < 0) {
                break;
            } else if (input % 4 == 0) {
                average += input;
                count++;
            }
        }
        System.out.println(average + "  " + count);
        average = average / count;
        System.out.println("Sayıların ortalaması : " + average);

    }

}