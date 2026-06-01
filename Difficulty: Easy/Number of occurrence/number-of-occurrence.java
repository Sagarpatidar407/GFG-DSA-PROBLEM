class Solution {
    
    public static int first_occ(int[] arr, int key){
        
        int first = -1;
        
        int s = 0;
        int e = arr.length-1;
        
        int mid = s + (e-s)/2;
        
        while(e>=s){
            if(arr[mid] == key){
                first = mid;
                e = mid-1;
            }else if(key < arr[mid]){
                e = mid-1;
            }else{
                s = mid+1;
            }
            mid = s + (e-s)/2;
        }
        return first;
        
    }
    public static int last_occ(int[] arr, int key){
        int last = -1;
        
        int s = 0;
        int e = arr.length-1;
        
        int mid = s + (e-s)/2;
        
        while(e>=s){
            if(arr[mid] == key){
                last = mid;
                s = mid+1;
            }else if(key < arr[mid]){
                e = mid-1;
            }else{
                s = mid+1;
            }
            mid = s + (e-s)/2;
        }
        return last;
    }
    
    
    int countFreq(int[] arr, int target) {
        // code here
        
        int first = first_occ(arr, target); 
        int last = last_occ(arr, target); 
        
        if(first == -1 || last == -1){
            return 0;
        }
        
        return last - first + 1;
        
    }
}
