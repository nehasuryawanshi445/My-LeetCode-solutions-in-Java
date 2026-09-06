class Solution {
    public boolean isPalindrome(String s) {
       
          s = s.toLowerCase();
          String a = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                a += ch;
            }
        }
        String rev = new StringBuilder(a).reverse().toString();
        
       return a.equals(rev);
    }
}