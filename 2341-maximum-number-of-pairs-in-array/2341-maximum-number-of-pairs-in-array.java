class Solution {
    public int[] numberOfPairs(int[] nums) {
       int ans = 0;
        int leftover = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) {
                continue;
            }

            int cnt = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                    nums[j] = -1;
                }
            }

            ans += cnt / 2;
            leftover += cnt % 2;
        }

        return new int[]{ans, leftover};
    }
}