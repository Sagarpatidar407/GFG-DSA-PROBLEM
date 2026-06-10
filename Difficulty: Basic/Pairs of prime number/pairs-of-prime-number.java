import java.util.*;

class Solution {
    
    boolean isPrime(int num) {
        if (num < 2)
            return false;
            
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        
        return true;
    }
    
    public int[] prime_pairs(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int p = 2; p <= n; p++) {
            if (isPrime(p)) {
                
                for (int q = 2; q <= n; q++) {
                    if (isPrime(q) && p * q <= n) {
                        list.add(p);
                        list.add(q);
                    }
                }
            }
        }
        
        int[] ans = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}