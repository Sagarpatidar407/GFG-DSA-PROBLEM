class Solution {

    private long power(int base, int exp, int limit) {
        long ans = 1;

        for (int i = 0; i < exp; i++) {
            ans *= base;

            if (ans > limit) {
                return ans;
            }
        }

        return ans;
    }

    public int nthRoot(int n, int m) {

        if (m == 0) return 0;  // Edge case

        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long val = power(mid, n, m);

            if (val == m) {
                return mid;
            } else if (val < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}