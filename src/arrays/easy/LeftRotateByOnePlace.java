package arrays.easy;

import java.util.Arrays;

public class LeftRotateByOnePlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        int [] newArr=leftRotateBrute(arr);
        System.out.println(Arrays.toString(leftRotateOptimal(arr)));
    }

    private static int[] leftRotateBrute(int[] arr) {
//        Just shift the all the elements to one index behind
//        For the first index shift the element to the last index
        int[] temp = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            temp[i-1] = arr[i];
        }
        temp[temp.length-1] = arr[0];
        return temp;
    }
    private static int[] leftRotateOptimal(int [] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
}
