class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
       int min = 0; 
        
        for(int i = 0; i < nums.size(); i++){
            int sum = 0;

            for(int j = i; j < nums.size(); j++){
                sum += nums.get(j);

                int len = j - i + 1;

                if(len >= l && len <= r && sum > 0){

                    if(min == 0 || min > sum){
                        min = sum;
                    }
                }
            }
        }
        
         return min == 0? -1 : min;
    }
}