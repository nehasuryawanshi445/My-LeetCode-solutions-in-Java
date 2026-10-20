class Solution {
    public int sortableIntegers(int[] nums) {
       int n = nums.length;
        int ans = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;

            boolean possible = true;
            int prevMax = Integer.MIN_VALUE;

            for (int start = 0; start < n; start += k) {
                int min = nums[start];
                int max = nums[start];
                int desc = 0;

                for (int j = 0; j < k; j++) {
                    int a = nums[start + j];
                    int b = nums[start + (j + 1) % k];

                    if (a > b) desc++;

                    min = Math.min(min, a);
                    max = Math.max(max, a);
                }

                if (desc > 1 || prevMax > min) {
                    possible = false;
                    break;
                }

                prevMax = max;
            }

            if (possible) ans += k;
        }

        return ans;
    }
}