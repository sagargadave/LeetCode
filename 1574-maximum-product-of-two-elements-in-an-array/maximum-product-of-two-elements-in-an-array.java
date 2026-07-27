class Solution {
    public int maxProduct(int[] nums) {

        int max1 = 0, max2 = 0, n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] >= max1) {
                max2 = max1;
                max1 = nums[i];
            }

            if(nums[i] > max2 && nums[i] < max1)
            {
                max2 = nums[i];
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}