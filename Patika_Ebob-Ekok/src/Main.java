import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n1 Sayısını girin : ");
        int n1 = scan.nextInt();

        System.out.print("n2 Sayısını girin : ");
        int n2 = scan.nextInt();

        if (n1 > n2) {
            n1 = n1 + n2;
            n2 = n1 - n2;
            n1 = n1 - n2;
        }

        int ebob = 0;
        int ekok = 1;

        int i = n1;
        while (i > 0) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }
        i = 1;
        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Ebobları : " + ebob + " Ekokları : " + ekok);

    }
}