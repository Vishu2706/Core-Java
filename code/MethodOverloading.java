public class MethodOverloading {

    public static void main(String[] args) {
        int intResult = add(5, 3);
        double doubleResult = add(2.5, 3.7);
        String stringResult = add("Hello", " World");

        System.out.println("Integer result: " + intResult);
        System.out.println("Double result: " + doubleResult);
        System.out.println("String result: " + stringResult);
    }

    // Method for adding integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for adding doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for concatenating strings
    public static String add(String a, String b) {
        return a + b;
    }
}