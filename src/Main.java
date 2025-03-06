import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Raj", "Shivani", "Rishi");
        List<String> namesWithLengthGreaterThan3 = names.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());
        System.out.println("Names greater than 3 "+namesWithLengthGreaterThan3);
    }
}