import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(exponent(a, n));
    }
    public static int exponent(int a, int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return a * exponent(a, n-1);
    }
}
