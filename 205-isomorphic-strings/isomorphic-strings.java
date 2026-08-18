class Solution {
    public boolean isIsomorphic(String s, String t) {

        int slen = s.length();

        HashMap<Character, Character> mp = new HashMap<>();

        for (int i = 0; i < slen; i++) {

            char schr = s.charAt(i);
            char tchr = t.charAt(i);

            if (mp.containsKey(schr)) {
                if (mp.get(schr) != tchr) {
                    return false;
                }
            } else if (mp.containsValue(tchr)) {
                return false;
            }

            mp.put(schr, tchr);
        }

        return true;
    }
}