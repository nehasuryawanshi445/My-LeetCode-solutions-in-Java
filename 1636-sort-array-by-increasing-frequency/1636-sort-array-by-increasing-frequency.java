class Solution {
    public int[] frequencySort(int[] nums) {
        for(int i = 0; i < nums.length; i++){
             for(int j = i + 1; j < nums.length; j++){
                int cnt  = 0;
                int cnt2 = 0;
                for(int k = 0; k < nums.length; k++){

                    if(nums[i] == nums[k]){
                        cnt++;
                    }
                }
                for(int k = 0; k < nums.length; k++){
                    if(nums[j] == nums[k]){
                        cnt2++;
                    }
                }
                if(cnt > cnt2 ||
                   (cnt == cnt2 && nums[i] < nums[j])){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                   }
             }
        }
        return nums;
    }
}