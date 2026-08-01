class Solution {
    public boolean containsDuplicate(int[] nums) {
       
      HashSet <Integer> s = new HashSet<>();

      for(int a : nums){
        if(!s.add(a)){
            return true;
        }
      }
      return false;
    }
}