class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int a = nums2.length;
        int k = 0;
        Set <Integer> set = new HashSet<>();

        for(int i =  0; i < n; i++){
            for(int j = 0; j < a; j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                   
                }
            }
        }
        int []arr = new int[set.size()];
        for(int num : set){
            arr[k] = num;
            k++;
        }
        return arr;
       
    }
}