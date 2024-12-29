import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);

        System.out.println("Value for key 'Apple': " + map.get("Apple"));
        System.out.println("Value for key 'Banana': " + map.get("Banana"));

        System.out.println("HashMap elements:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        String keyToCheck = "Cherry";
        if (map.containsKey(keyToCheck)) {
            System.out.println("The key '" + keyToCheck + "' exists in the HashMap.");
        } else {
            System.out.println("The key '" + keyToCheck + "' does not exist in the HashMap.");
        }

        map.remove("Date");
        System.out.println("HashMap after removing key 'Date': " + map);
    }
}