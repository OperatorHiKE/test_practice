import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check_prime = scanner.nextInt();
        prime(check_prime);
        }
        public static void prime(int check_prime)
        {
            int counter = 0;
            for (int i = 1; i <= check_prime; i++)
            {
                if(check_prime % i == 0) counter++;
            }
            if (counter > 2) System.out.println("Composite");
            else System.out.println("Prime");
        }
    }

