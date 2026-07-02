class Solution {
    public String reverseWords(String s) {

        String s1 = "", result = "", space = "";
        int n = s.length() - 1;

        boolean flag = true;

        for (int i = n; i >= 0; i--) {

            if (s.charAt(i) != ' ') {
                s1 = s.charAt(i) + s1;
            }

            if ((i > 0 && i < n) && (s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {

                result = result + space + s1;
                s1 = "";
                space = " ";
            }
        }

        result = result + " " + s1;

        return result.trim();
    }
}