class Solution {
    static int closestNumber(int n, int m) {
        
        int q = n / m;
        
        int n1 = m * q;
        
        int n2;
        
        if ((n * m) > 0)
            n2 = m * (q + 1);
        else
            n2 = m * (q - 1);
        
        if (Math.abs(n - n1) < Math.abs(n - n2))
            return n1;
        
        return n2;
    }
}