class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        boolean []found = new boolean[len + 1];

        for(int i = 0; i < len; i++){
            found[nums[i]] = true;
        }

        List<Integer> arr = new ArrayList<>();
      
        for(int i = 1; i <= len; i++){
           
                if(found[i] == false){
                    arr.add(i);
                }
            }
        
        
        return arr;
    }
}