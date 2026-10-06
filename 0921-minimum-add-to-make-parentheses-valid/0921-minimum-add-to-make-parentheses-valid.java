class Solution {
    public int minAddToMakeValid(String s) {
        int cnt = 0;
        int add = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                cnt++;
                
            }
            else{
                cnt--;
            }
            if(cnt < 0){
                cnt++;
                add++;
            }
        }
        return cnt + add;
    }
}