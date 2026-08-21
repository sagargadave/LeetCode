class Solution {
    public boolean wordPattern(String pattern, String s) {

        String arr[] = s.split(" ");
        HashMap<Character, String> mp = new HashMap<>();

        if (arr.length != pattern.length()) {
            return false;
        }

        int i = 0;

        for (char ch : pattern.toCharArray()) {
            if (mp.containsKey(ch)) {
                if (!mp.get(ch).equals(arr[i])) {
                    return false;
                }
            } else if (mp.containsValue(arr[i])) {
                return false;
            }

            mp.put(ch, arr[i++]);
        }

        return true;
    }
}