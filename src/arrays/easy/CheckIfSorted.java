package arrays.easy;

public class CheckIfSorted {
    public static void main(String[] args) {
        int [] arr = {1,2,4,8};
        boolean sorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]> arr[i+1]) {
                sorted = false;
                break;
            }
        }
        if(sorted) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");

    }
}
