import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        reverse(n);
  }
    public static void reverse(int n)
    {
        if (n == 0) return;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        reverse(n-1);
        System.out.println(x);
    }
}
