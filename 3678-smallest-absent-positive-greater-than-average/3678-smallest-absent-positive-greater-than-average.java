class Solution {
    public int smallestAbsent(int[] nums) {
         int sum = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            sum += num;
            set.add(num);
        }

        double avg = (double) sum / nums.length;

        int x = Math.max(1, (int) avg + 1);

        while (set.contains(x)) {
            x++;
        }

        return x;
    }
}