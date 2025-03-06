import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,5,1,7);
        List<Integer> asc = numbers.stream()
                .sorted().collect(Collectors.toUnmodifiableList());
        List<Integer> desc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toUnmodifiableList());
        Integer secondLargest = desc.get(1);
        System.out.println("Second l is"+ secondLargest);
    }


}
