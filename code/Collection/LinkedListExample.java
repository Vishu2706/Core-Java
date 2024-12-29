import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1 in LinkedList: " + linkedList.get(1));

        // Iterating over the LinkedList
        System.out.println("LinkedList elements:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Removing an element
        linkedList.remove("Banana");
        System.out.println("LinkedList after removing 'Banana': " + linkedList);
    }
}