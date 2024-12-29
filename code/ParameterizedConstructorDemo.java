class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        person.display();
    }
}