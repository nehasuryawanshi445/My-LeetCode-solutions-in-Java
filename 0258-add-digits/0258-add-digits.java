class Solution {
    public int addDigits(int num) {
       
        if(num < 10 )
             return num;

         int digit = 0;
        while(num > 0){
            int a = num % 10;
            digit += a;
            num /= 10;
         
        }
           if(digit >= 10){
           return addDigits(digit);
        }
        
        return digit;
    }
}