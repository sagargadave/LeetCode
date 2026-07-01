class Solution {
    public int reverse(int x) {
        int no = x;
        long reverse = 0;

        while (no != 0) {
            reverse = (no % 10) + reverse * 10;
            no /= 10;
        }

        if (reverse < -2147483648 || reverse > 2147483647) {
            return 0;
        }

        return (int) reverse;
    }
}