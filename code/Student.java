public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        Student person = new Student("John", 30);
        System.out.println(person.getName());  
        System.out.println(person.getAge());   
        person.setName("Jane");
        person.setAge(25);
        System.out.println(person.getName()); 
        System.out.println(person.getAge());   
    }
}