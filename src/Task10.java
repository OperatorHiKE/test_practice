import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b > a) System.out.println(gcd(b,a));
        else System.out.println(gcd(a,b));
    }
    public static int gcd(int a, int b)
    {
        int r = a % b;
        if (r == 0) return b;
        else return gcd(b,r);
    }
}
