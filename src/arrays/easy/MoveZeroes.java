package arrays.easy;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 1, 4, 1, 0, 6, 9};
        moveZeroes(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeroes(int[] arr, int length) {
        int k = 0;
        while (k < length) {
            if (arr[k] == 0) {
                break;
            } else {
                k++;
            }
        }

        int i = k, j = k + 1;
        while (i < length && j < length) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
    }
}
