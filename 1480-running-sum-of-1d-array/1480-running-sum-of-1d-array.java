class Solution {
    public int[] runningSum(int[] nums) {
        int k = 1;
        
        for(int i = 1; i < nums.length; i++){
            nums[k] = nums[i] + nums[i - 1];
            k++;
        }
        return nums;
    }
}