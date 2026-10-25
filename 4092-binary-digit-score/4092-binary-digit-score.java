class Solution {
    int binaryDigit(int x){
       int cnt = 0;

        while (x > 0) {
            cnt += x % 2;
            x = x / 2;
        }

        return cnt;

    }
    public int calculateScore(int a, int b) {
        int s1 = binaryDigit(a);
        int s2 = binaryDigit(b);

        if(s1 >= s2)
        return s1 * s2;

        return s2 / s1;
    }
}