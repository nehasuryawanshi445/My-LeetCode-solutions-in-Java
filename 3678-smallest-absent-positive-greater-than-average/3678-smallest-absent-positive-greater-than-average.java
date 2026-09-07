class Solution {
    public int smallestAbsent(int[] nums) {
          int sum = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            sum += num;
            set.add(num);
        }

        double avg = (double) sum / nums.length;

        int i = 1;

        while (i <= avg || set.contains(i)) {
            i++;
        }

        return i;
    }
}