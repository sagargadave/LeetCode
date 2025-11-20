class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        List<String> str = new ArrayList<>();
        HashMap<String, Integer> m = new HashMap<>();
        String str1 = "";
        int j = 0;

        for (int i = 0; i < words.length; i++) {
            m.put(words[i], 0);

            if (j < k) {
                str.add("-1");
                j++;
            }
        }

        for (j = 0; j < words.length; j++) {
            str1 = words[j];
            m.put(str1, m.get(str1) + 1);
        }

        for (int m1 = 0; m1 < words.length; m1++) {
            str1 = words[m1];

            if (str.get(m.get(str1) - 1) == "-1") {
                str.add(m.get(str1) - 1, str1);
            } else {
                str.add(m.get(str1), str1);
            }

            if (str.get(m.get(str1) - 1) == "-1") {
                str.remove(m.get(str1) - 1);
            }
            else
            {
                str.remove(m.get(str1));
            }
        }

        System.out.println(m);
        System.out.println(str);

        for (j = k; j < str.size(); j++) {
            str.remove(j);
        }

        Collections.reverse(str);

        return str;
    }
}