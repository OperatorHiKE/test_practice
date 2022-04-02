import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers_size = scanner.nextInt();
        int[] numbers = new int[numbers_size];
        for (int i = 0; i < numbers_size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(average(numbers));
    }
    public static double average(int[] numbers) {
        double value = 0;
        double return_value = 0;
        for (int i = 0; i< numbers.length; i++) {
            value += numbers[i];
        }
        return_value = value / numbers.length;
        return return_value;
    }
}
