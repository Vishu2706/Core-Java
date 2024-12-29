public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";

        System.out.println("Using equals() method:");
        System.out.println("str1 equals str2: " + str1.equals(str2)); // false
        System.out.println("str1 equals str3: " + str1.equals(str3)); // true

        System.out.println("\n Using compareTo() method:");
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2)); // negative value
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3)); // 0
        System.out.println("str2 compareTo str1: " + str2.compareTo(str1)); // positive value
    }
}