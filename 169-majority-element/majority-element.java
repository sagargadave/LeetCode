class Solution {
    public int majorityElement(int[] nums) {

        int result = nums[0], count = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                result = nums[i];
                count = 0;
            }

            if (result == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return result;
    }
}