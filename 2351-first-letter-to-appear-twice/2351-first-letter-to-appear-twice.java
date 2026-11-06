class Solution {
    public char repeatedCharacter(String s) {
        int []arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';

            if(arr[index] == 1){
                return s.charAt(i);
            }
           arr[index]++;
            }
        
        return ' ';
    }
}