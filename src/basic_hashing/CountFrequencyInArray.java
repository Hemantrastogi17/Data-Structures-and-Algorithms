package basic_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountFrequencyInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 6, 7, 9};
        int n = arr.length;
//        countFrequency(arr, n);
        countFrequencyHashing(arr,n);
    }

    private static void countFrequencyHashing(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

    }

    private static void countFrequency(int[] arr, int n) {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);

        }


    }
}
