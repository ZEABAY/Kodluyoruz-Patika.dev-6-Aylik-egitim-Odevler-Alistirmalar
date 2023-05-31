import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] zodiac = new String[]{"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        int year;

        Scanner scan = new Scanner(System.in);
        System.out.print("Doğduğnuz yılı giriniz : ");
        year = scan.nextInt();

        System.out.println("Çin Zodyağı Burcunuz : " + zodiac[year % 12]);

    }
}
