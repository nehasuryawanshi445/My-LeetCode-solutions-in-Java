class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
       int original = n;
        int mul = 1;
        while(n > 0){
            sum += (n % 10);
            mul = mul * (n % 10);
            
            n /= 10;
        }
        int total = sum + mul;
        
        return original % total == 0;
    }
}