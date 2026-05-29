class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        
        int sum = 0;
        
        if(n < 2){
            return arr[0];
        }
        
        for(int i=0;i<n;i++){
            
            sum = sum + arr[i];
            
            max = Math.max(max, sum);
            
            if(sum < 0){
                sum = 0;
            }
            
        }
        
        return max;
    }
}
