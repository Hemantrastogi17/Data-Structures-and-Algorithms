package sorting_techniques;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,2,3,7,0};
        mergeSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int l, int r, int[] arr) {
        int mid = (l + r) / 2;
        int[] newArr = new int[arr.length];
        if (l < r) {
            mergeSort(l, mid, arr);
            mergeSort(mid + 1, r, arr);
            merge(l, mid, r, arr);
        }
    }

    private static void merge(int l, int mid, int r, int[] arr) {
        int i = l;
        int j = mid + 1;
        int k = l;
        int[] mergedArr = new int[10000];
        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                mergedArr[k++] = arr[i++];
            } else {
                mergedArr[k++] = arr[j++];
            }
        }
        if (i > mid) {
            while (j <= r) {
                mergedArr[k++] = arr[j++];
            }
        } else {
            while (i <= mid) {
                mergedArr[k++] = arr[i++];
            }
        }
        for (k = l; k <= r; k++) {
            arr[k] = mergedArr[k];
        }

    }


}
