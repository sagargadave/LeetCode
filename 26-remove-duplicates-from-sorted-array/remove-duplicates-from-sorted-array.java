class Solution {
    public int removeDuplicates(int[] nums) {

        int right = 0, n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[right]) {
                nums[++right] = nums[i];
            }
        }

        return right + 1;
    }
}