/* 
560. Subarray Sum Equals K

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
 
Constraints:
1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
 
Solution :
*/

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);

        int result = 0, sum = 0;

        for (int no : nums) {
            sum += no;

            if (mp.containsKey(sum - k)) {
                result += mp.get(sum - k);
            }

            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}