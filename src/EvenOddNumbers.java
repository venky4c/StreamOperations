import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenNumbers = numbers.stream().filter(num -> (num%2 ==0))
                .collect(Collectors.toUnmodifiableList());
       // System.out.println("Evens are "+evenNumbers);
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> (num%2 !=0))
                .collect(Collectors.toUnmodifiableList());
        Integer max = numbers.stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println("Max number "+max);
        Integer min = numbers.stream()
                .min(Integer::compare)
                .orElse(0);
        System.out.println("Min num is"+min);





    }
}
