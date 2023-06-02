import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Otomatik oluşturulacak dizinin satır sayısını girin : ");
        int n = scan.nextInt();

        System.out.print("Otomatik oluşturulacak dizinin sütun sayısını girin : ");
        int m = scan.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Oluşturulan A matrisi =");
        System.out.println("{");
        for (int i = 0; i < n; i++) {
            System.out.print("{");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = rand.nextInt(10);
                if (j != (m - 1)) {
                    System.out.print(" " + matrix[i][j] + ", ");
                } else {
                    System.out.print(" " + matrix[i][j]);
                }
            }
            System.out.println("}");
        }
        System.out.println("}");

        int[][] matrixTranspos = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixTranspos[i][j] = matrix[j][i];
            }
        }

        System.out.println("Oluşturulan A matrisinin transpozu =");
        System.out.println("{");
        for (int i = 0; i < m; i++) {
            System.out.print("{");
            for (int j = 0; j < n; j++) {
                if (j != (n - 1)) {
                    System.out.print(" " + matrixTranspos[i][j] + ", ");
                } else {
                    System.out.print(" " + matrixTranspos[i][j]);
                }
            }
            System.out.println("}");
        }
        System.out.println("}");
    }
}