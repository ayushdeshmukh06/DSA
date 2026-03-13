class ProductOfArrayExceptSelf {
    public static int[] findProductExceptSelf(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        
        res[0] = 1;
        for(int i = 1; i < n; i++){
            res[i] = res[i - 1] * arr[i - 1];
        }
        
        int right = 1;
        for(int i = (n-1); i >= 0; i--) {
            res[i] = res[i] * right;
            right = right * arr[i];
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        
        int[] result = findProductExceptSelf(arr);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
     }
}