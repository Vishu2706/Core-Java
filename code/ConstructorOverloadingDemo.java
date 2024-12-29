class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Unknown";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        person1.display();  

        Person person2 = new Person("Jane Doe", 25, "123 Main St");
        person2.display();  
    }
}