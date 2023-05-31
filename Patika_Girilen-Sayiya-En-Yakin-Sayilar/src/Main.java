import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scan = new Scanner(System.in);
        System.out.println("En dizideki en yakın değerlerini aratmak istediğiniz sayıyı girin : ");
        int number = scan.nextInt();

        int smallerClosest = Integer.MIN_VALUE;
        int largerClosest = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < number && i > smallerClosest) {
                smallerClosest = i;
            }
            if (i > number && i < largerClosest) {
                largerClosest = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + smallerClosest);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + largerClosest);
    }
}