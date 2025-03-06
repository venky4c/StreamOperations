import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfNamesStartsWith {
    public static void main(String[] args) {
        List<String> members = Arrays.asList("Ram", "Madhu", "Ram", "More");
        char startingLetter = 'R';
        long count = members.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter))).count();
        System.out.println("R is "+ count);

        List<String> risingNames = members.stream()
                .sorted().collect(Collectors.toUnmodifiableList());
        List<String> descNames = members.stream()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toUnmodifiableList());
        System.out.println("Names in order"+ descNames);
    }
}
