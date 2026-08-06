class Solution {
    public int mySqrt(int x) {
        if(x < 2)
        return x;
        int l = 0;
        int h = x;
        int ans = 0;

        while(l <= h){
            int mid = (l + h) / 2;
            long s = (long) mid * mid;
            if(s == x){
                return mid;
            }
            else if(s < x){
                ans = mid;
                l = mid + 1;
            }
            else{
               // ans = mid;
                h = mid - 1;
            }
           
        }
        return  ans;
    }
}