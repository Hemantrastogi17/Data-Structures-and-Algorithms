package sorting_techniques;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr, int n) {
//        Find the minimum element in the unsorted array and swap it with the element at the beginning.
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 1};
        selectionSort(arr, arr.length);

    }
}
