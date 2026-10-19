class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int len  = nums.length;
        Arrays.sort(nums);
        int []res = new int[len];

         int j = 0;
        for(int i = 0; i < len; i++){
           
            if(nums[i] == target){
                res[j] = i;
                j++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < j; i++){
            list.add(res[i]);
        }
        return list;
            }
}