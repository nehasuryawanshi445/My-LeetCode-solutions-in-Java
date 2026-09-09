class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long pow = 1000;
       while(pow <= n){
        ans = ans + n - pow + 1;
        pow = pow * 1000;
       }
        return ans;
    }
}