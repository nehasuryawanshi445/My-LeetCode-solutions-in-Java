class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
       int ans = -1;
       for(int i = 0; i < n; i++){
        int count = 0;
        for(int j = 0; j <= n - k; j++){
            boolean found = false;
            for(int s = j; s < j + k; s++){
                if(nums[i] == nums[s]){
                    found = true;
                    break;
                }
            }
            if(found){
                count++;
            }
        }
        if(count == 1){
            ans = Math.max(ans , nums[i]);
        }
       }
       return ans;
    }
}