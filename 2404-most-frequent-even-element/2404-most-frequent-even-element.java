class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        int []arr = new int[n];
        int k = 0;
        int current_cnt = 0;
        int ans = -1;

        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                arr[k] = nums[i];
                k++;
            }
        }
        for(int i = 0; i < k; i++){
             int cnt = 1;
            for(int j = i + 1; j < k; j++){
                if(arr[i] == arr[j]){
                    cnt++;

                }
            }
           
            if(cnt > current_cnt){
               current_cnt = cnt;
               ans = arr[i];
            }
            else if(cnt == current_cnt && arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}