public class Counter {
    private static int count = 0;

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter.incrementCount();
        Counter.incrementCount();

        System.out.println("Current count: " + Counter.getCount());
    }
}