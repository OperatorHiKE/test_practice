import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        isNumber(s);
    }
    public static void isNumber(String s)
    {
        try{
            int value = Integer.parseInt(s);
            System.out.println("Yes");
        }
        catch (NumberFormatException e)
        {
            System.out.println("No");
        }
    }
}
