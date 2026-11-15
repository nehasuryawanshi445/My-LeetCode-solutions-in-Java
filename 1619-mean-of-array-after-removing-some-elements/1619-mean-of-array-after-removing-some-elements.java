class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double sum = 0;
        double cnt = 0;
        int remove = arr.length / 20;

        for(int i = remove; i < arr.length - remove; i++){
           
                sum += arr[i];
                cnt++;
            
        }
        return sum / cnt;
    }
}