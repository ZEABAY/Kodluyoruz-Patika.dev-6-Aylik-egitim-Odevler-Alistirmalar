import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner scan = new Scanner(System.in);
        heat = scan.nextInt();

        if (heat >= 25) {
            System.out.println("Yüzmeye Gidebilirsiniz");

        } else if (heat >= 15) {
            System.out.println("Pikniğe Gidebilirsiniz");

        } else if (heat >= 5) {
            System.out.println("Sinemaya Gidebilirsiniz");

        } else {
            System.out.println("Kayak Yapmaya Gidebilirsiniz");

        }
    }
}