class Solution {
    public boolean isAnagram(String s, String t) {

        int slen = s.length(), tlen = t.length();

        if (slen != tlen) {
            return false;
        }

        int arr[] = new int[26];

        for (int i = 0; i < slen; i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < tlen; i++) {

            if (arr[t.charAt(i) - 'a'] == 0) {
                return false;
            }

            arr[t.charAt(i) - 'a'] -= 1;
        }

        return true;
    }
}