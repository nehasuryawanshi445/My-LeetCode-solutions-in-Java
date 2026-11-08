class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Arrays.sort(deck);

        int gcd = 0;
        int count = 0;

        for(int i = 0; i < deck.length; i++) {

            count++;

            if(i == deck.length - 1 || deck[i] != deck[i+1]) {

                int a = gcd;
                int b = count;

                while(b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }

                gcd = a;
                count = 0;
            }
        }

        return gcd >= 2;
        }
    }
