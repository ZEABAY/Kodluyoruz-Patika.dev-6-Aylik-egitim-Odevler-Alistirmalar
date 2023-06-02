import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(7);
        }

        System.out.println(Arrays.toString(numbers));


        int[] duplicate = new int[numbers.length];
        Arrays.fill(duplicate, 1);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    numbers[i] = numbers[j];
                    duplicate[i]++;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "->" + duplicate[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        System.out.print("\n\n");
        System.out.println("Dizide en çok tekrar eden çift sayı/sayılar : ");

        for (int i = 0; i < numbers.length; i++) {
            if (duplicate[i] > 0) {
                System.out.println(numbers[i] + " sayısı " + duplicate[i] + " kez tekrarladı");
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        duplicate[j] = 0;
                    }
                }
            }
        }

        int maxEvenIndex = -1;
        int maxOddIndex = -1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                if (maxEvenIndex == -1 || duplicate[i] > duplicate[maxEvenIndex]) {
                    maxEvenIndex = i;
                }
            } else {
                if (maxOddIndex == -1 || duplicate[i] > duplicate[maxOddIndex]) {
                    maxOddIndex = i;
                }
            }
        }

        System.out.print("\n\n");
        System.out.println("En Çok Tekrarlayan Çift Sayı: " + numbers[maxEvenIndex]);
        System.out.println("En Çok Tekrarlayan Tek Sayı: " + numbers[maxOddIndex]);
    }
}