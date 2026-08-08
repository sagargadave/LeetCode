class Solution {
    public boolean isAnagram(String s, String t) {

        int slen = s.length(), tlen = t.length();

        if (slen != tlen) {
            return false;
        }

        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < slen; i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < tlen; i++) {
            mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 0) - 1);

            if (mp.get(t.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }
}