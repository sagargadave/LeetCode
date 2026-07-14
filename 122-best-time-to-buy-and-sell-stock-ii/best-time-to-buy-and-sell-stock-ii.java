class Solution {
    public int maxProfit(int[] nums) {

        int profit = 0, n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                profit += nums[i + 1] - nums[i];
            }
        }

        return profit;
    }
}