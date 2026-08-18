class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int count[] = new int[26];

        for (char ch : ransomNote.toCharArray()) {
            count[ch - 'a']++;
        }

        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                return false;
            }
        }

        return true;
    }
}