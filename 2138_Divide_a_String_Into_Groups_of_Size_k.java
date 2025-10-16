class Solution {
    public String[] divideString(String s, int k, char fill) {
        int size = (int) Math.ceil((double) s.length() / k);
        String result[] = new String[size];
        
        int index = 0;
        for (int i = 0; i < s.length(); i += k) {
            if (i + k <= s.length())
                result[index++] = s.substring(i, i + k);
            else {
                String temp = s.substring(i);
                while (temp.length() < k) temp += fill;
                result[index++] = temp;
            }
        }
        return result;
    }
}