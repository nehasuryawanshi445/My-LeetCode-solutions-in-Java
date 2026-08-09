class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int a = n;
     for (int i = 0; i < n ; i++){
        if(nums[i] != i){
            a = i;
            break;
        }
     }
     return a;
    }
}