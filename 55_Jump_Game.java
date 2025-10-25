/*
Problem :
55. Jump Game

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105

Solution :
*/

class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length - 1, length = nums[0];
        for (int i = 0; i <= length; i++) {
            if (i >= n || length >= n) {
                return true;
            }
             if (length < nums[i] ) {
                length = nums[i] + 1;
            }

            if (i == length && nums[i] != 0) {
                length += nums[i];
            }
        }
        return false;
    }
}
