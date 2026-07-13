class Solution {
    public int lengthOfLongestSubstring(String s) {

        int j = 0, result = 0, n = s.length();

        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (mp.containsKey(ch) && mp.get(ch) >= j) {
                j = mp.get(ch) + 1;
            }

            result = Math.max(i - j + 1, result);

            mp.put(ch, i);
        }

        return result;
    }
}