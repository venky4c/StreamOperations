import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapFn {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> numbersDoubled = numbers.stream()
                .map(num -> num*2)
                .collect(Collectors.toList());
       // Integer[] numArray = new Array

    }
}
