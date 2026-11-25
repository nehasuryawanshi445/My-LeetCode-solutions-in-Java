class Solution {
    public boolean uniqueOccurrences(int[] arr) {
          for (int i = 0; i < arr.length; i++) {

            int count1 = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count1++;
                }
            }

            for (int k = i + 1; k < arr.length; k++) {

                if (arr[i] != arr[k]) {

                    int count2 = 0;

                    for (int l = 0; l < arr.length; l++) {
                        if (arr[k] == arr[l]) {
                            count2++;
                        }
                    }

                    if (count1 == count2) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}