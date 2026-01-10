/* 
229. Majority Element II

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]

Example 3:
Input: nums = [1,2]
Output: [1,2]
 
Constraints:
1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109

Solution :
*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Set<Integer> s1 = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }

            if (cnt > n / 3) {
                s1.add(nums[i]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(s1);

        return list;
    }
}