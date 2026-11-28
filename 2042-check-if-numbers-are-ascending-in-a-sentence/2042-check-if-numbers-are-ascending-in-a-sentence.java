class Solution {
    public boolean areNumbersAscending(String s) {
      String []arr = s.split(" ");
      int res = 0;

      for(int i = 0; i < arr.length; i++){
        if(Character.isDigit (arr[i].charAt(0))){
            int num = Integer.parseInt(arr[i]);
            if(num <= res){
                return false;
            }
            res = num;
        }
      }
      return true;
    }
}