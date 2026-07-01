class Solution {
    public int missingNumber(int[] nums) {

        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            sum2 += i+1;
        }

        return Math.abs(sum1 - sum2);
    }
}