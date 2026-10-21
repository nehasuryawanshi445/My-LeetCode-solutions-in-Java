class Solution {
    public char findTheDifference(String s, String t) {
        boolean[] found = new boolean[t.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j) && !found[j]) {
                    found[j] = true;
                    break;
                }
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (!found[j]) {
                return t.charAt(j);
            }
        }

        return ' ';
    }
}