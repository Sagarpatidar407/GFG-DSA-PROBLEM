class Solution {
    
    public boolean isVerified(int num, int key, int[] arr){
    
        int pagesum = 0;
        int count = 1;
    
        for(int i = 0; i < arr.length; i++){
    
            if(arr[i] > num)
                return false;
    
            if(pagesum + arr[i] <= num){
                pagesum += arr[i];
            }
            else{
                count++;
    
                if(count > key)
                    return false;
    
                pagesum = arr[i];
            }
        }
    
        return true;
    }
        
    public int findPages(int[] arr, int k) {
        
        if(arr.length < k){
            return -1;
        }
        
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int s = 1;
        int e = sum;
        
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            
            if(isVerified(mid, k, arr)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
            
        }
        
        return ans;
        
    }
}