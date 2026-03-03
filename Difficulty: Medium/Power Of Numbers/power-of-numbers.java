class Solution {
    
    private int reverse(int n){
        int rev = 0;
        
        while(n!=0){
            int ld = n%10;
            rev = rev*10 + ld;
            n = n/10;
        }
        
        return rev;
        
    }
    
    public int reverseExponentiation(int n) {
        
        int rev = reverse(n);
        
        int power = 1;
        
        for(int i=0;i<rev;i++){
            power = power*n;
        }
        
        return power;
        
    }
}
