import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(fibonacci_term(number));
    }
    public static int fibonacci_term(int number)
    {
        if (number == 0) return 0;
        if (number == 1) return 1;
        return (fibonacci_term(number-1) + fibonacci_term(number - 2));
    }
}
