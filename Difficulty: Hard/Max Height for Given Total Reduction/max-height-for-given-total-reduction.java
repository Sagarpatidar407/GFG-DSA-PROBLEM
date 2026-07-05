class Solution {
    
    public boolean isValid(int mid, int[] arr, int m){
        
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] - mid >= 0){
                sum = sum + (arr[i] - mid);
            }
            if(sum >= m) return true;
        }
        if(sum < m) return false;
        return true;
        
    }
    
    int maxHeight(int[] arr, int m) {
        // code here
        
        Arrays.sort(arr);
        
        int s = 0;
        int e = arr[arr.length - 1];
        int ans = -1;
        
        while(s<=e){
            
            int mid = s + (e-s)/2;
            
            if(isValid(mid, arr, m)){
                ans = mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
            
        }
        
        return ans;
        
        
        
    }
}
