class Solution {
    public boolean isPalindrome(String s) {

        boolean flag = false;

        String str = "";

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                if (ch >= 'A' && ch <= 'Z') {
                    ch += 32;
                }

                str += ch;
            }
        }

        int i = 0, j = str.length() - 1;

        while (i <= j) {

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}