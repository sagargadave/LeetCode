class Solution {
    public int maxArea(int[] nums) {

        int n = nums.length, max = 0, left = 0, right = n - 1;

        while (right >= left) {

            if (nums[right] < nums[left]) {
                max = Math.max(max, ((right-left) * nums[right]));                
                right--;
            } else {
                max = Math.max(max, ((right-left) * nums[left]));
                left++;
            }
        }

        return max;
    }
}