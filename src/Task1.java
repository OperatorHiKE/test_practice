import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers_size = scanner.nextInt();
        int[] numbers = new int[numbers_size];

        for (int i = 0; i < numbers_size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(minimum(numbers));
    }
    public static int minimum(int[] numbers) {
        int min_number = numbers[0];
        for (int i = 1; i< numbers.length; i++) {
            if (min_number > numbers[i]) min_number = numbers[i];
        }

        return min_number;
    }
}
