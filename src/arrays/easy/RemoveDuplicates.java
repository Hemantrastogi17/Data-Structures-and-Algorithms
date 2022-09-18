package arrays.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 4, 2, 6, 8};
        int n = removeDuplicatesNaive(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(n);
    }

    public static int removeDuplicatesOptimal(int [] arr) {

        int i = 0, j = 1;
        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            } else
                j++;
        }
        return i + 1;
    }

    private static int removeDuplicatesNaive(int[] arr, int length) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr) {
            set.add(ele);
        }
        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            arr[i] = it.next();
        }
        return set.size();
    }
}

