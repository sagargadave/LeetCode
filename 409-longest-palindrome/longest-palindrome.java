class Solution {
    public int longestPalindrome(String s) {

        int cFrq[] = new int[26];
        int sFrq[] = new int[26];

        int result = 0, odd = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= 65 && ch <= 91) {
                cFrq[ch - 'A']++;
            } else {
                sFrq[ch - 'a']++;
            }
        }

        boolean flag = true;

        for (int i = 0; i < 26; i++) {

            if ((cFrq[i] % 2 != 0)) {
                flag = false;
                result += cFrq[i] - 1;
            }
            if ((sFrq[i] % 2 != 0)) {
                flag = false;
                result += sFrq[i] - 1;
            }
            if (sFrq[i] != 0 && sFrq[i] % 2 == 0) {
                result += sFrq[i];
            }
            if (cFrq[i] != 0 && cFrq[i] % 2 == 0) {
                result += cFrq[i];
            }
        }

        if (!flag) {
            result++;
        }

        return result;
    }
}