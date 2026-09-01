class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n  = nums1.length;
        int a = nums2.length;
        int k = 0;
        int []arr = new int[Math.min(n , a)];

        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < a; j++){
               if(nums1[i] == nums2[j]){
                arr[k] = nums1[i];
                k++; 

                nums2[j] = -1;
                break;
               }
            }
        }
        return Arrays.copyOf(arr , k);
    }
}