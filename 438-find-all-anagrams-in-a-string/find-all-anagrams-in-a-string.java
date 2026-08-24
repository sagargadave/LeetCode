class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int slen = s.length(), plen = p.length();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < slen; i++) {
            if (p.indexOf(s.charAt(i)) >= 0) {
                int arr[] = new int[26];
                boolean flag = true, flag1 = true;

                for (int j = i; j < i + plen; j++) {
                    if (j < slen) {
                        arr[s.charAt(j) - 'a']++;
                    } else {
                        flag1 = false;
                        break;
                    }
                }

                if (flag1) {
                    for (int k = 0; k < plen; k++) {
                        arr[p.charAt(k) - 'a']--;
                    }

                    for (int l = 0; l < 26; l++) {
                        if (arr[l] > 0) {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        list.add(i);
                    }
                }
            }

        }

        return list;
    }
}