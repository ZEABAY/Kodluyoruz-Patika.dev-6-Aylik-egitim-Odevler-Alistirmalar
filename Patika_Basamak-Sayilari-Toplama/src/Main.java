import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String input = "";
        int temp, result = 0;

        System.out.println("Bir Sayı Giriniz : ");
        Scanner scan = new Scanner(System.in);

        input = scan.nextLine();
        for (int i = 0; i < input.length(); i++) {
            temp = Integer.parseInt(String.valueOf(input.charAt(i)));
            result += temp;
        }

        System.out.println("Sayının basamak sayılarının toplamı : " + result);
    }
}