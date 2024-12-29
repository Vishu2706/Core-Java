
import java.util.Scanner;

public class Condition{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("It is even.");
        }else{
            System.out.println("It is Odd.");
        }
    }
}