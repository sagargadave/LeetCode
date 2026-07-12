class Solution {
    public int countHomogenous(String s) {

        int j = 0, len = s.length(), n = s.length();
        long result = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt(j)) {
                result += i - j + 1;
            } else {
                result += 1;
                j = i;
            }
        }

        return (int ) ((result) % (1000000007));
    }
}