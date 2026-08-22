class Solution {
    public int longestPalindrome(String s) {

        int freq[] = new int[128];
        int result = 0;

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        boolean odd = false;

        for (int count : freq) {
            result += (count / 2) * 2;

            if (count % 2 != 0) {
                odd = true;
            }
        }

        if (odd) {
            result++;
        }

        return result;
    }
}