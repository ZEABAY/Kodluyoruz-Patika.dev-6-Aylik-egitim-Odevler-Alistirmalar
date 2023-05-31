import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        double price, kdv = 0.18;

        Scanner scan = new Scanner(System.in);
        price = scan.nextFloat();

        System.out.println("KDV'siz fiyat = " + price);
        System.out.println("KDV'li fiyat = " + (price + price * kdv));
        System.out.println("KDV tutarı = " + (price * kdv));

    }
}