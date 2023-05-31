import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner scan = new Scanner(System.in);

        System.out.println("İlk Sayıyı Girin");
        n1 = scan.nextInt();

        System.out.println("İşlemi Sayıyı Girin");
        n2 = scan.nextInt();

        System.out.println("Hangi İşlemi Yapmak İstiyorsunuz ? 1 : Toplama\n1 : Çıkartma\n1 : Çarpma\n1 : Bölme");
        select = scan.nextInt();


        switch (select) {
            case 1:
                System.out.println("Toplam Sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.println("fark Sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpım Sonucu: " + (n1 * n2));
                break;
            case 4:
                System.out.println("bölüm Sonucu: " + (n1 / n2));
                break;
            default:
                System.out.println("Yanlış İşlem Srçtiniz: ");
        }

    }
}