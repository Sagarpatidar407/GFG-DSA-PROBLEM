class Solution {
    public int findTarget(int arr[], int target) {

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] == target)
                return mid;

            if (mid - 1 >= 0 && arr[mid - 1] == target)
                return mid - 1;

            if (mid + 1 < arr.length && arr[mid + 1] == target)
                return mid + 1;

            if (target < arr[mid]) {
                e = mid - 2;
            } else {
                s = mid + 2;
            }
        }

        return -1;
    }
}