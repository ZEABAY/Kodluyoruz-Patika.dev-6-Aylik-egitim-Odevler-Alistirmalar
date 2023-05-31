import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        String passwordPlaceholder = "java123";
        int select;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = scan.nextLine();

        System.out.print("Şifreniz : ");
        password = scan.nextLine();

        if (userName.equals("patika") && password.equals(passwordPlaceholder)) {
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Bilgileriniz Yanlış!!!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ?\n1 evet / 2 hayır");
            select = scan.nextInt();
            if (select == 1) {
                System.out.println("Yeni parolanızı giriniz");

                Scanner scann = new Scanner(System.in);
                password = scann.nextLine();


                if (password.equals(passwordPlaceholder)) {
                    System.out.println("Yeni Şifreniz Eski Şifrenizle Aynı Olamaz Lütfen Tekrar Deneyin");
                    passwordPlaceholder = password;
                } else {
                    System.out.println("Şifreniz başarıyla oluşturuldu");
                }
            }
        }
    }
}