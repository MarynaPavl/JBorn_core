package s16;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {

        int[] array = new Random().ints(10, -100, 100).toArray();
        System.out.println(Arrays.toString(array));

        int sum1 = IntStream.range(0, array.length)
                .filter(i -> i % 2 == 0)
                .map(i -> array[i])
                .sum();
        System.out.println(sum1);
    }
}