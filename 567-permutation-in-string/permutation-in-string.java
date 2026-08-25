class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int s1len = s1.length(), s2len = s2.length();

        if (s2len < s1len) {
            return false;
        }

        for (int i = 0; i < s2len; i++) {
            if (s1.indexOf(s2.charAt(i)) != -1) {
                int count[] = new int[26];
                boolean flag = true;
                boolean flag2 = true;

                for (int j = i; j < (i + s1len); j++) {
                    if (j < s2len) {
                        count[s2.charAt(j) - 'a']++;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    for (char ch : s1.toCharArray()) {
                        count[ch - 'a']--;
                    }

                    for (int l = 0; l < 26; l++) {
                        if (count[l] > 0) {
                            flag2 = false;
                            break;
                        }
                    }

                    if (flag2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}