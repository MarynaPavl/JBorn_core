package s16;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new Random().ints(10000000, -100, 100).toArray();
        // почему если сделать больше 245 милионов відает Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
       //  в такой ситуации нужно увеличивать heap вручную??? (и как?) или как поступать?
      //  System.out.println(Arrays.toString(array) + "\n");

        long start = System.nanoTime();
        int sumStream = Arrays.stream(array)
                .filter(value -> value > 0)
                .sum();
        System.out.println(sumStream + " Stream: " + ((int) (System.nanoTime() - start) / 1_000_000.0) + " milisec");

        System.out.println("-----------------------------------------");

        long start2 = System.nanoTime();
        int sumParallel = Arrays.stream(array).parallel()
                .filter(value -> value > 0)
                .sum();
        System.out.println(sumParallel + " ParallelStream: " + ((int) (System.nanoTime() - start2) / 1_000_000.0) + " milisec");

    }
}
