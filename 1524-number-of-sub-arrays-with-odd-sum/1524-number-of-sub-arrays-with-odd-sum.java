class Solution {
    public int numOfSubarrays(int[] arr) {
        long odd = 0;
        long even = 1;
        long sum = 0;
        long cnt = 0;

        for(int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if(sum % 2 != 0) {
                cnt += even;
                odd++;
            }
            else {
                cnt += odd;
                even++;
            }

            cnt %= 1000000007;
        }

        return (int)cnt;
    }
}