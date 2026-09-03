class Solution {
    public boolean isValid(String s) {
        char []a = new char[s.length()];
        int top = -1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                top++;
                a[top] = ch;
            }
            else{
                if(top == -1){
                    return false;
                }
                if((ch == ')' && a[top] == '(') ||  
                   (ch == ']' && a[top] == '[') || 
                   (ch == '}' && a[top ]== '{'))
                   {
                    top--;
                    
                }
                else{
                    return false;
                }
                  
            }
        }
       if(top == -1){
        return true;
       }
       return false;
    }
}