import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin boyutu : ");
        int arrSize = scan.nextInt();

        int[] array = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            System.out.print((i + 1) + " Elemanı : ");
            array[i] = scan.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {

                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(array));
    }
}