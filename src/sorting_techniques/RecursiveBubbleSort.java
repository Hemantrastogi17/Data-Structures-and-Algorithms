package sorting_techniques;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void recursiveBubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count+=1;
            }
        }
        if (count == 0) return;
        recursiveBubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 5, 1};
        recursiveBubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
