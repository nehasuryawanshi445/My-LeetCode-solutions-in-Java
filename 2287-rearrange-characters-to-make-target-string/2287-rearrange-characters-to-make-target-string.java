class Solution {
    public int rearrangeCharacters(String s, String target) {
        int cnt = 0;

        while(true){
            String temp = s;
            for(char c : target.toCharArray()){
                if(temp.indexOf(c) == -1){
                    return cnt;
                }
                temp = temp.replaceFirst(String.valueOf(c), "");
            }
            s = temp;
            cnt++;
        }
    }
}