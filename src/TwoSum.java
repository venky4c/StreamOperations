import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoSum {
    public static void main(String[] args) {
        sortNumericArray(new int[]{5, 2, 4});
    }
    public static int[] sortNumericArray(int[] nums){
        IntStream intStream = Arrays.stream(nums);
        IntStream sortedStream = intStream.sorted();
        nums = sortedStream.toArray();
        System.out.println("Num array is >>>>>>>>>>"+ Arrays.toString(nums));

        return nums;
    }

    public static String[] sortStringArray(String[] stringArray){
        Stream<String> stringStream = Arrays.stream(stringArray).sorted();
        return null;//stringStream.toArray();
    }
}
