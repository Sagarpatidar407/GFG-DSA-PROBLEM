class Solution {
    
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        ArrayList<Integer> brr = new ArrayList<>();

        int n = arr.length;
        
        int[] freq = new int[n+1];
        
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        
        int missing = -1;
        int repeating = -1;
        
        for(int j=1;j<=n;j++){
            if(freq[j] == 0){
                missing = j;
            }
            if(freq[j] == 2){
                repeating = j;
            }
        }
        
        
        brr.add(repeating);
        brr.add(missing);
        
        return brr;
        
    }
}
