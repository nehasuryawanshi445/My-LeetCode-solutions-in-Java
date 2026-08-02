class Solution {
    public int lengthOfLastWord(String s) {

        s = s.trim();
        int index = s.lastIndexOf(" ");
        String last = s.substring(index + 1);

        return last.length();

    }
}