
import java.util.Scanner;

public class Detail{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails();
        s1.showDetails();
    }
}

class Student{
    String name;
    int age;

    void setDetails(){
        System.out.println("Enter Name");
        Scanner sc = new Scanner (System.in);
        this.name = sc.nextLine();
        System.out.println("Enter Age");
        this.age = sc.nextInt();
    }

    void showDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}