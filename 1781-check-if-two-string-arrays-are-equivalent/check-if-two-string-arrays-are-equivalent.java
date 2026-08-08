class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();

        int w1len = word1.length, w2len = word2.length;

        for (int i = 0; i < w1len; i++) {
            w1.append(word1[i]);
        }

        for (int i = 0; i < w2len; i++) {
            w2.append(word2[i]);
        }

        return w1.toString().equals(w2.toString());
    }
}