class Solution {

    public int maxActiveSectionsAfterTrade(String s) {

        int n = s.length();

        int totalOnes = 0;
        int previousZero = Integer.MIN_VALUE;
        int maxGain = 0;

        int i = 0;

        while (i < n) {

            int j = i;

            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }

            int length = j - i;

            if (s.charAt(i) == '1') {
                totalOnes += length;
            } else {
                maxGain = Math.max(maxGain, previousZero + length);
                previousZero = length;
            }

            i = j;
        }

        return totalOnes + maxGain;
    }
}