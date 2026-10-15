class Solution {
    public int sumCounts(List<Integer> nums) {
        int []arr = new int[nums.size()];
        int sum = 0;
    
        for(int i = 0; i < nums.size(); i++){
            arr[i] = nums.get(i);
        }
        for (int i = 0; i < arr.length; i++) {
            boolean[] found = new boolean[101];
            int distinct = 0;

            for (int j = i; j < arr.length; j++) {
                if (!found[arr[j]]) {
                    found[arr[j]] = true;
                    distinct++;
                }

                sum += distinct * distinct;
            }
        }

        return sum;
    }
}