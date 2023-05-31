import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year = scan.nextInt();


        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " yılı bir artık yıldır");
                } else {
                    System.out.println(year + " yılı bir artık yıl değildir");
                }
                return;
            }
            System.out.println(year + " yılı bir artık yıldır");
        } else {
            System.out.println(year + " yılı bir artık yıl değildir");
        }
    }
}