package s11;

import java.util.Arrays;

public class Task1 {
    static void quickSort(int[] array, int left, int right) {
        int l = left;
        int r = right;
        int support = array[right];
        while (left < right) {
            while (array[left] <= support && left < right) {
                left++;
            }
            if (left != right) {
                array[right] = array[left];
                right--;
            }
            while (array[right] >= support && left < right) {
                right--;
            }
            if (left != right) {
                array[left] = array[right];
                left++;
            }
        }
        array[left] = support;
        support = left;
        left = l;
        right = r;
        if (left < support)
            quickSort(array, left, support - 1);
        if (right > support)
            quickSort(array, support + 1, right);
    }

    public static void main(String[] args) {
        int[] array = {9, -6, 1, -2, 5, 9, 4};
        int left = 0;
        int right = array.length - 1;

        System.out.println("Before " + Arrays.toString(array));

        quickSort(array, left, right);

        System.out.println("After " + Arrays.toString(array));
    }
}


