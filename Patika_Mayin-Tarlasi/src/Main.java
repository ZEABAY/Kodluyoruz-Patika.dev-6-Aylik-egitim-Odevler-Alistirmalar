import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;

        System.out.print("Haritanın satır sayısı : ");
        n = scan.nextInt();

        System.out.print("Haritanın sütun sayısı : ");
        m = scan.nextInt();


        MineSweeper game = new MineSweeper(n, m);

        System.out.println("\n==========\n");
        game.printGameeMap();

        while (!game.isOver) {
            System.out.print("Seçiminiz kaçıncı satırda : ");
            n = scan.nextInt();

            System.out.print("Seçiminiz kaçıncı sütunda : ");
            m = scan.nextInt();

            System.out.println("\n==========\n");
            game.run(n, m);

        }

    }
}