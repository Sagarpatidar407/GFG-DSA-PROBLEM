class Solution {
    public int[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        
        for(int i = 2; i <= n; i++) {
            prime[i] = true;
        }
        
        for(int i = 2; i * i <= n; i++) {
            if(prime[i]) {
                for(int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        
        int count = 0;
        for(int i = 2; i <= n; i++) {
            if(prime[i]) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        
        for(int i = 2; i <= n; i++) {
            if(prime[i]) {
                result[index++] = i;
            }
        }
        
        return result;
    }
}