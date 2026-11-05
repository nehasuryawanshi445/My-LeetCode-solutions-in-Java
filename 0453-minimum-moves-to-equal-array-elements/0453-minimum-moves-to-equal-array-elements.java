class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int res = 0;

        for(int i = 1; i < nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            res += nums[i] - min; 
        }
        return res;
    }
}