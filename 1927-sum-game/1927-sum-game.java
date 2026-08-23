class Solution {
    public boolean sumGame(String num) {
        int len = num.length();
        int mid = len / 2;

        int leftQ = 0;
        int rightQ = 0;

        int left = 0;
        int right = 0;

        for(int i = 0; i < mid; i++){
            if(num.charAt(i) == '?'){
                leftQ++;
            }
            else{
                left += num.charAt(i) - '0';
            }
        }
        for(int j = mid; j < len; j++){
            if(num.charAt(j) == '?'){
                rightQ++;
            }
            else{
                right += num.charAt(j) - '0';
        }
        }
         if ((leftQ + rightQ) % 2 == 1) {
            return true;
        }
        int dif = left - right;
        int qdif = rightQ - leftQ;
        
        if(dif == 9 * qdif / 2){
            return false;
        }
       
            return true;
    }
}