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
        n = result.length();

        if (result.charAt(n - 1) == ' ') {
            for (int i = n - 1; i >= 0; i--) {
                if (result.charAt(i) == ' ') {
                    result = result.substring(0, i);
                    break;
                }
            }
        }

        if (result.charAt(0) == ' ') {
            for (int i = 0; i < n; i++) {
                if (result.charAt(i) != ' ') {
                    result = result.substring(i, n);
                    break;
                }
            }
        }

        return result;
    }
}