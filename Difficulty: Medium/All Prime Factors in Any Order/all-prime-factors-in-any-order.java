class Solution {
    
    ArrayList<Integer> primeFactors(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=2;i*i<=n;i++){
            while(n%i == 0){
                arr.add(i);
                n/=i;
            }
        }
        
        if(n>1){
            arr.add(n);
        }
        
        return arr;
        
    }
}
