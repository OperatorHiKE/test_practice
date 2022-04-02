import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        int[] numbers = new int[result];

        for (int i = 0; i < result; i++) {
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
