import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int result = scanner.nextInt();
                System.out.println(bunny_ears(result));
        }
    public static int bunny_ears(int n)
    {
        if (n == 1)
        {
            return 2;
        }
        else
        {
            return (bunny_ears(n-1) + 2);
        }

    }
}
