class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        int len = strs.length, prefle = prefix.length();

        for (int i = 1; i < len; i++) {
            String s = strs[i];

            while (s.length() < prefle || !prefix.equals(s.substring(0, prefle))) {

                prefle--;

                if (prefle == 0) {
                    return "";
                }

                prefix = prefix.substring(0, prefle);
            }
        }

        return prefix;
    }
}