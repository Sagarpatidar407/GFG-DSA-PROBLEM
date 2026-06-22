class Solution {
    
    private boolean isPrime(int n){
        boolean ans = true;
        if(n==2 || n==3) return true;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        
        return ans;
        
    }
    
    public List<Integer> primeRange(int l, int r) {
        
        List<Integer> arr = new ArrayList<>();
        
        for(int i=l;i<=r;i++){
            if(isPrime(i) && i!=1){
                arr.add(i);
            }
        }
        
        return arr;
        
        
    }
}