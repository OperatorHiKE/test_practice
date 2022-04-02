import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(factorial(number));
    }
    public static int factorial(int number)
    {
        if (number == 0) return 1;
        return number * factorial(number-1);
    }
}
