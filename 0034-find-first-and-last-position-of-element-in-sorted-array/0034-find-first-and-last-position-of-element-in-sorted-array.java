class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int s = 0;
        int e = nums.length - 1;

        int[] b = {-1, -1};

        
        while (s <= e) {
            int mid = (s + e) / 2;

            if (nums[mid] == target) {
                b[0] = mid;
                e = mid - 1;
            }
            else if (nums[mid] > target) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }

        s = 0;
        e = nums.length - 1;
          while (s <= e) {
            int mid = (s + e) / 2;

            if (nums[mid] == target) {
                b[1] = mid;
                s = mid + 1;
            }
            else if (nums[mid] > target) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
       return b;
    }
}