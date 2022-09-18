package arrays.easy;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int ele = sc.nextInt();
        int [] arr = {1,2,4,5,6,7,9};
        if(linearSearch(arr,ele)){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }

    private static boolean linearSearch(int [] arr,int ele) {
        boolean found = false;
        for(int elem: arr){
            if(elem == ele) found = true;
        }
        return found;
    }
}
