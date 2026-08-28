class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int half = n / 3;
        List<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    cnt++;
                }
            }
            if(cnt > half && !ans.contains(nums[i])){
                ans.add(nums[i]);
            }
        }
       return ans;
    }
}