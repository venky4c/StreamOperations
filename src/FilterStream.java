import java.util.*;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {

    public static String findLargestString(List<String> strings){
        Optional<String> largestString
                = strings.stream()
                .reduce((s1, s2) -> s1.compareTo(s2) > 0 ? s1 : s2);
                return largestString.orElse("");
    }
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Ram", "Raj", "Shivani", "Rishi");
            //find longest string in a list of string
            List<String> perlu = Arrays.asList("uvwyx","ramya", "ab", "bcd");
            System.out.println("Longest among strings>>>"+findLargestString(perlu));
            List<String> namesWithLengthGreaterThan3 = names.stream()
                    .filter(name -> name.length() > 3)
                    .collect(Collectors.toList());
            List<String> namesInCapitals =
                    names.stream().map(name -> name.toUpperCase())
                            .collect(Collectors.toUnmodifiableList());
            //System.out.println("Names in UC"+ namesInCapitals);
            //System.out.println("Names greater than 3 "+namesWithLengthGreaterThan3);
            List<Integer> numbers = Arrays.asList(1,2,3,4,5);
            double average = numbers.stream()
                            .mapToDouble(Integer::doubleValue)
                                    .average()
                                            .orElse(0.0);
           // System.out.println("average is "+average);

        }
    }
