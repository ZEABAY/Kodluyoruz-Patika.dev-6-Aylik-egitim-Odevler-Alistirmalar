import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day;
        String sign = "";

        Scanner scan = new Scanner(System.in);
        System.out.print("Dogduğunuz Ay : ");
        month = scan.nextInt();

        System.out.print("Doğduğunuz Gün : ");
        day = scan.nextInt();

        if (month == 1) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 22) {
                    sign = "Oğlak";
                } else {
                    sign = "Kova";
                }
            }
        }
        if (month == 2) {
            if ((day <= 29) && (day >= 1)) {
                if (day < 20) {
                    sign = "Kova";
                } else {
                    sign = "Balık";
                }
            }
        }
        if (month == 3) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 21) {
                    sign = "Balık";
                } else {
                    sign = "Koç";
                }
            }
        }
        if (month == 4) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 22) {
                    sign = "Koç";
                } else {
                    sign = "Boğa";
                }
            }
        }
        if (month == 5) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 22) {
                    sign = "Boğa";
                } else {
                    sign = "İkizler";
                }
            }
        }
        if (month == 6) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 23) {
                    sign = "İkizler";
                } else {
                    sign = "Yengeç";
                }
            }
        }
        if (month == 7) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 24) {
                    sign = "Yengeç";
                } else {
                    sign = "Aslan";
                }
            }
        }
        if (month == 8) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 23) {
                    sign = "Aslan";
                } else {
                    sign = "Başak";
                }
            }
        }
        if (month == 9) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 23) {
                    sign = "Başak";
                } else {
                    sign = "Terazi";
                }
            }
        }
        if (month == 10) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 23) {
                    sign = "Terazi";
                } else {
                    sign = "Akrep";
                }
            }
        }
        if (month == 11) {
            if ((day <= 30) && (day >= 1)) {
                if (day < 22) {
                    sign = "Akrep";
                } else {
                    sign = "Yay";
                }
            }
        }
        if (month == 12) {
            if ((day <= 31) && (day >= 1)) {
                if (day < 22) {
                    sign = "Yay";
                } else {
                    sign = "Oğlak";
                }
            }
        }

        System.out.println("Burcunuz : " + sign);

    }


}
