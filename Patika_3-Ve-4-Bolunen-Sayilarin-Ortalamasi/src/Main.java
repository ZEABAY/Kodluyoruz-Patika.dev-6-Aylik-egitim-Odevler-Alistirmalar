import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int input = scan.nextInt();
        int temp = 0;
        int count = 0;

        for (int i = 1; i <= input; i++) {
            if (i % 12 == 0) {
                temp += i;
                count++;
            }
        }

        temp = temp / count;
        System.out.println("0 dan girilen sayıya kadar olan 3 e ve 4 e tam bölünen sayıların ortalaması = " + temp);
    }
}