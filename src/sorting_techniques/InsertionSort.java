package sorting_techniques;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int [] arr, int n){
        for(int i=1;i<n;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr = {1,3,2,5,0};
        insertionSort(arr, arr.length);
    }
}
