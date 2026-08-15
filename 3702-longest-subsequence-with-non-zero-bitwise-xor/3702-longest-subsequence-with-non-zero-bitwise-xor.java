class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
      
    int currXor = 0;
        boolean nonZero = false;

        for (int num : nums) {
            currXor ^= num;
            if (num != 0)
                nonZero = true;
        }

        if (currXor != 0)
            return n;

        if (!nonZero)
            return 0;

        return n - 1;
    }
}