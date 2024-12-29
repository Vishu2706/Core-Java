public class Constoverload {
    // default constructor 1
    Constoverload() {
        System.out.println("Default constructor");
    }

    // parameterized constructor 2
    Constoverload(int num) {
        System.out.println("Parameterized constructor with single parameter");
        System.out.println("The parameter value is: " + num);
    }

    // parameterized constructor 3
    Constoverload(int num1, int num2) {
        System.out.println("Parameterized constructor with two parameters");
        System.out.println("The parameter values are: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        // Creating objects
        Constoverload obj = new Constoverload();
        Constoverload obj1 = new Constoverload(10);
        Constoverload obj2 = new Constoverload(10, 20);
    }
}