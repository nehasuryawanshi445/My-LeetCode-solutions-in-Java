class Solution {
    
   public boolean isvowel(char ch){

    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        return true;

    if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        return true;

    return false;
   }

    String reversestringOfVowel(String s, int n){
        char []ch = s.toCharArray();

        int start = 0;
        int end = n - 1;

        while(start < end){

           if(!isvowel(ch[start])){
            start++;
           } 
           else if(!isvowel(ch[end])){
            end--;
           }
           else{
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
            
           }

        }
        return new String(ch);
    }
    
    public String reverseVowels(String s) {
        return reversestringOfVowel(s , s.length());
    }
}