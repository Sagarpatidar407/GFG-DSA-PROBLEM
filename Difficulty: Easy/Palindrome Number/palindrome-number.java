class Solution {
    public boolean isPalindrome(int n) {
        if(n < 0){
            n = -n;
        }

        int temp = n;
        int sum = 0;

        while(n > 0){
            int ld = n % 10;
            sum = sum * 10 + ld;
            n /= 10;
        }

        return temp == sum;
    }
}