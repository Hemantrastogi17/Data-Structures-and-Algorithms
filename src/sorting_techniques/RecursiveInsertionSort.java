package sorting_techniques;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4};
        recursiveInsertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void recursiveInsertionSort(int[] arr, int n) {
        if (n == 1) return;
        recursiveInsertionSort(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
