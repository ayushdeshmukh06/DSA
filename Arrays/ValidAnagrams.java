import java.util.Arrays;

public class ValidAnagrams {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        char[] arr1 = s.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = t.replaceAll("\\s", "").toLowerCase().toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        
        return false;
    }
    
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}