class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        
        int n = arr.length;
        int[] right = new int[n];
        int[] left = new int[n];
        
        right[0] = arr[0];
        for(int i=1;i<n;i++){
            right[i] = right[i-1] + arr[i];
        }
        
        left[n-1] = arr[n-1];
        for(int j=n-2;j>=0;j--){
            left[j] = left[j+1] + arr[j];
        }
        
        for(int k=0;k<n;k++){
            if(left[k] == right[k]){
                return k;
            }
        }
        
        return -1;
        
    }
}
