class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;
        String pref = strs[0];
        int preflen = pref.length();

        for (int i = 1; i < n; i++) {
            String s = strs[i];

            while (s.length() < preflen || !pref.equals(s.substring(0, preflen)) ) {
                preflen--;

                if (preflen == 0) {
                    return "";
                }
                
                pref = pref.substring(0, preflen);
            }            
        }

        return pref;
    }
}