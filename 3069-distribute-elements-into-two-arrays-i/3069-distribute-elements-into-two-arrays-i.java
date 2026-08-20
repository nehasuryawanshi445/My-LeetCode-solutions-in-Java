class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int x = 0;
         int y = 0;
        int []arr = new int[n];
        int []arr1 = new int[n];
        int []nums1 = new int [n];
       
       arr[x] = nums[0];
       x++;

       arr1[y] = nums[1];
       y++;

       for(int i = 2; i < n; i++){
        if(arr[x - 1] > arr1[y - 1]){
            arr[x] = nums[i];
            x++;
        }
        else{
            arr1[y] = nums[i];
            y++;
        }
       }
           System.arraycopy(arr , 0 , nums1 , 0 , x);
           System.arraycopy(arr1 , 0, nums1, x,y);
          
        
        return nums1;
    }
}