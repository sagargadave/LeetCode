/*
459. Repeated Substring Pattern

Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

Example 2:
Input: s = "aba"
Output: false

Example 3:
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

Constraints:
1 <= s.length <= 104
s consists of lowercase English letters.

Solution :
*/

class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();
        boolean flag = true;

        for (int i = 1; i < n; i++) {

            if (s.charAt(0) == s.charAt(i)) {

                int j = i, k = 0;

                while (j < n) {

                    if (s.charAt(k++) != s.charAt(j++)) {
                        flag = false;
                        break;
                    }

                    if (k == i) {
                        k = 0;
                    }
                }
                if (flag && n % i == 0) {
                    return true;
                }
                flag = true;
            }
        }
        return false;
    }
}