import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1 in ArrayList: " + arrayList.get(1));

        // Iterating over the ArrayList
        System.out.println("ArrayList elements:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // Removing an element
        arrayList.remove("Banana");
        System.out.println("ArrayList after removing 'Banana': " + arrayList);
    }
}