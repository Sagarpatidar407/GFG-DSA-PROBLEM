class Solution {
    public int rowWithMax1s(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int maxCount = 0;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            int low = 0, high = m - 1;
            int firstOne = -1;

            // Binary search to find first 1
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[i][mid] == 1) {
                    firstOne = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            if (firstOne != -1) {
                int count = m - firstOne;
                if (count > maxCount) {
                    maxCount = count;
                    ans = i;
                }
            }
        }

        return ans;
    }
}