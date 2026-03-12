// Returns the indices of the two numbers that add up to the target

import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            
            if(map.containsKey(complement)){
                return new int[] { map.get(complement), i };
            }
            
            map.put(arr[i], i);
        }
        
        return new int[] {};
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 2};
        int target = 9;
        
        int[] result = twoSum(arr, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}