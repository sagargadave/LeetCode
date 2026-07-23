class Solution {

    private boolean check(String haystack, String needle, int i) {
        int haystackLen = haystack.length(), needleLen = needle.length(), k = 0;

        if ((haystackLen - i) < needleLen) {
            return false;
        }

        for (int j = i; j < haystackLen; j++) {
            if ((k < needleLen) && (haystack.charAt(j) != needle.charAt(k++))) {
                return false;
            }
        }

        return true;
    }

    public int strStr(String haystack, String needle) {

        int haystackLen = haystack.length(), needleLen = needle.length();

        if (haystackLen < needleLen) {
            return -1;
        }

        for (int i = 0; i < haystackLen; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (check(haystack, needle, i)) {
                    return i;
                }
            }
        }

        return -1;
    }
}