
import java.util.Scanner;

public class Case{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num 1");
    int num1 = sc.nextInt();
    System.out.println("Enter num 1");
    int num2 = sc.nextInt();

    System.out.println("");
    System.out.println("************");
    System.out.println("Enter 1 to addition");
    System.out.println("Enter 2 to Subtraction");
    System.out.println("Enter 3 to multiplication");
    System.out.println("Enter 4 to Division");

    int ans = sc.nextInt();

    switch (ans) {
        case 1 -> System.out.println("num1 + num2 = " + (num1 + num2));
        case 2 -> System.out.println("num1 - num2 = " + (num1 - num2));
        case 3 -> System.out.println("num1 * num2 = " + (num1 * num2));
        case 4 -> System.out.println("num1 / num2 = " + (num1 / num2));
        default -> System.out.println("Invalid case");
    }
}
}