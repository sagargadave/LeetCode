class Solution {
    public String reverseWords(String s) {

        String s1 = "", result = "", space = "";
        int n = s.length() - 1, ind = 0;
        boolean flag = true;

        for (int i = n; i >= 0; i--) {

            if (flag && s.charAt(i) != ' ') {
                ind = i;
                flag = false;
            }

            if ((i > 0 && i < n) && (s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {

                result = result + space + s.substring(i + 1, ind + 1);
                s1 = "";
                space = " ";
                flag = true;
            }
        }

        if (!flag) {
            result = result + " " + s.substring(0, ind + 1).trim();
        }

        return result.trim();
    }
}