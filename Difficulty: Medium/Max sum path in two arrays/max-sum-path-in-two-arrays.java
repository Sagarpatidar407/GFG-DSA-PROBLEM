class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0, result = 0;

        while (i < arr1.size() && j < arr2.size()) {
            int a = arr1.get(i);
            int b = arr2.get(j);

            if (a < b) {
                sum1 += a;
                i++;
            } else if (a > b) {
                sum2 += b;
                j++;
            } else {
                result += Math.max(sum1, sum2) + a;
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        while (i < arr1.size()) {
            sum1 += arr1.get(i++);
        }

        while (j < arr2.size()) {
            sum2 += arr2.get(j++);
        }

        result += Math.max(sum1, sum2);

        return result;
    }
}