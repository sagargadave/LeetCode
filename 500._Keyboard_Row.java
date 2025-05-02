class Solution {
    public String[] findWords(String[] words) {

        List<String> l1 = new ArrayList<>();
        String str1 = "";

        for (int i = 0; i < words.length; i++) {
            boolean flag = true;

            String str = words[i].toLowerCase();

            if ("qwertyuiop".contains(str.charAt(0) + "")) {
                str1 = "qwertyuiop";
            } else if ("asdfghjkl".contains(str.charAt(0) + "")) {
                str1 = "asdfghjkl";
            } else if ("zxcvbnm".contains(str.charAt(0) + "")) {
                str1 = "zxcvbnm";
            }

            for (int j = 0; j < str.length(); j++) {
                if (!str1.contains(str.charAt(j) + "")) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                l1.add(words[i]);
            }
        }

        String[] array = l1.toArray(new String[0]);

        return array;
    }
}