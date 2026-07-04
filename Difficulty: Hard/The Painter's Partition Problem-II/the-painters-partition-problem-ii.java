class Solution {
    
    public boolean isValid(int mid, int[] arr, int key){
        
        int sum = 0;
        int count = 1;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i] > mid) return false;
            
            if(sum+arr[i] <= mid){
                sum+=arr[i];
            }else{
                count++;
                sum = arr[i];
                if(count > key) return false;
            }
            
        }
        
        return true;
        
    }
    
    public int minTime(int[] arr, int k) {
        // code here
        
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        
        int s = 1;
        int e = sum;
        int ans = -1;
        
        while(s<=e){
            int mid = s + (e-s)/2;
            
            if(isValid(mid,arr,k)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        
        return ans;
        
    }
}
