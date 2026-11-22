class Solution {
    public int countDominantElements(int[] nums) {
        int cnt = 0;
        if(nums.length == 1)
        return 1;

        for(int i = 0; i < nums.length; i++){
            if(i == 0 ){
                if(nums[i] >= nums[i + 1])
                cnt++;
            }
            else if(i == nums.length - 1){
                if(nums[i] >= nums[i - 1])
                cnt++;
            }
            else{
                double res = (nums[i - 1] + nums[i + 1]) / 2.0;
                if(nums[i] >= res){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}