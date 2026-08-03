class Solution {
    
    public void mergeArray(int arr[], int l, int r, int mid){
        
        int n = mid - l + 1;
        int m = r - mid;
        
        int[] left = new int[n];
        int[] right = new int[m];
        
        for(int i=0;i<n;++i){
            left[i] = arr[l+i];
        }
        
        for(int j=0;j<m;++j){
            right[j] = arr[mid + 1 + j];
        }
        
        int i=0, j=0;
        
        int k=l;
        
        while (i < n && j < m) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < m) {
            arr[k] = right[j];
            j++;
            k++;
        }
        
    }
    
    public void mergeSort(int arr[], int l, int r) {
        // code here
        
        if(l < r){
            
            int mid = l + (r-l)/2;
            
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            
            mergeArray(arr,l,r,mid);
            
        }
        
    }
}