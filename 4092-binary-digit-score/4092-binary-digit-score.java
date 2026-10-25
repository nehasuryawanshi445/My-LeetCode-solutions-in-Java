class Solution {
    int binaryDigit(int x){
        return Integer.bitCount(x);

    }
    public int calculateScore(int a, int b) {
        int s1 = binaryDigit(a);
        int s2 = binaryDigit(b);

        if(s1 >= s2)
        return s1 * s2;

        return s2 / s1;
    }
}