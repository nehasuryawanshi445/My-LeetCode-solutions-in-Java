class Solution {
    public int minimumSum(int[] nums) {
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){

                for(int k = j + 1; k < nums.length; k++){

                    if(nums[i] < nums[j] && nums[k] < nums[j]){
                        int sum = nums[i] + nums[j] + nums[k];
                        
                        if(sum < res){
                            res = sum;
                        }
                    }
                }                
                }
            }
             if(res == Integer.MAX_VALUE){
                return -1;
        }
        return res;
    }
}