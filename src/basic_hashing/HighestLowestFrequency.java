package basic_hashing;

import java.util.*;

public class HighestLowestFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);

        int max = Integer.MIN_VALUE;
        for (int ele : map.keySet()) {
            if (map.get(ele) > max) max = map.get(ele);
        }

        int min = Integer.MAX_VALUE;
        for (int ele : map.keySet()) {
            if (map.get(ele) < min) min = map.get(ele);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == max)
                System.out.println("Element with Max Frequency:" + entry.getValue());
            if (entry.getKey() == min)
                System.out.println("Element with Min Frequency:" + entry.getValue());
        }
    }
}
