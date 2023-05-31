import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Serinin eleman sayısın girin : ");
        int n = scan.nextInt();

        int f = 0, s = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(f + " ");
            int nextTerm = f + s;
            f = s;
            s = nextTerm;
        }
    }
}