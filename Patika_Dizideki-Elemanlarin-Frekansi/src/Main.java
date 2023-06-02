import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};

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

        System.out.print("\n");
        System.out.println("Dizinin elemanlarının frekansı : ");
        System.out.print("\n");

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

    }
}