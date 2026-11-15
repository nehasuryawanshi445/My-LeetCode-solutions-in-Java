class Solution {
    public int countConsistent(int[] nums) {
        int cnt = 0;
        
        for(int i = 0; i < nums.length; i++){
            int min = nums[i];
            int and = min;

            for(int j = i; j < nums.length; j++){
                if(nums[j] < min){
                    min = nums[j];
                }

                and &= nums[j];

                if(and == min){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}