import java.util.*;


public class ContainsDuplicate_2 {
    // Approach 1: Using HashSet and HashMap, but it is not efficient as 
    // we are using two data structures and also we are iterating through 
    // the array twice. Takes 34ms of time to execute.

    // public static boolean containsDuplicate(int[] arr, int k) {
    //     HashSet<Integer> set = new HashSet<>();
    //     HashMap<Integer, Integer> map = new HashMap<>();
        
    //     for(int i = 0; i < arr.length; i++) {
    //         if (set.contains(arr[i]) && map.containsKey(arr[i])){
    //             int result = Math.abs(map.get(arr[i]) - i);
    //             if ( result <= k){
    //                 return true;
    //             }
    //         } else {
    //             set.add(arr[i]);
    //         }
    //         map.put(arr[i], i);
    //     }
        
    //     return false;
    // }

    // Approach 2: Using HashMap, takes 24ms of time to execute.

    public static boolean containsDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                if ( i - map.get(arr[i]) <= k){
                    return true;
                }
            }
            map.put(arr[i], i);
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 5};
        int k = 3;
        
        boolean result = containsDuplicate(arr, k);
        System.out.println(result);
    }
}