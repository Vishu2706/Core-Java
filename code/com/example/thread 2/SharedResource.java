public class SharedResource {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait(); 
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify(); 
    }

    public synchronized int consume() throws InterruptedException {
        while (!available) {
            wait(); 
        }
        available = false;
        System.out.println("Consumed: " + data);
        notify(); 
        return data;
    }
}