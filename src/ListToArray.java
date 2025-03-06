import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        // Create a List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Convert List to Array
        String[] array = new String[list.size()];
        array = list.toArray(array);

        // Print Array
        for (String fruit : array) {
            System.out.println(fruit);
        }
    }
}
