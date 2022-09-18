package arrays.easy;

import java.util.Arrays;

public class RightRotateByKPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
//        int[] newArr = RotateRight(arr, k);
        System.out.println(Arrays.toString(rotateRightReversal(arr,k)));
    }

    private static int[] RotateRight(int[] arr, int k) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }

    private static void reverse(int [] arr, int start,int end){
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    private static int[] rotateRightReversal(int[] arr, int k) {
        int n = arr.length;
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
        return arr;
    }
}
