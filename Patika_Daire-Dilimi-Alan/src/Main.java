import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14, r;
        int alfa;
        Scanner scan = new Scanner(System.in);
        System.out.println("Alanı hesaplanacak daire diliminin merkez açısını girin : ");
        alfa = scan.nextInt();

        System.out.println("Dairenin yarıçapını girin : ");
        r = scan.nextDouble();

        double area = (pi * (r * r) * alfa) / 360;
        System.out.println("Alan = " + area);

    }
}