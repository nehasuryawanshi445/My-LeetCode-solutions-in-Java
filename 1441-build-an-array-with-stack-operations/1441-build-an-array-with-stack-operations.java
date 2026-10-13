class Solution {
    public List<String> buildArray(int[] target, int n) {
        String []stack = new String[2 * n];
        int top = 0;
        int num = 1;

        for(int i = 0; i < target.length; i++){
           
           while(num < target[i]){
            stack[top] = "Push";
            top++;

            stack[top] = "Pop";
            top++;
            num++;
           }

           stack[top] = "Push";
           top++;
           num++;
            }
        
        return Arrays.asList(Arrays.copyOf(stack , top));
    }
}