/*
2799. Count Complete Subarrays in an Array

You are given an array nums consisting of positive integers.

We call a subarray of an array complete if the following condition is satisfied:

The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.
Return the number of complete subarrays.

A subarray is a contiguous non-empty part of an array.
 
Example 1:
Input: nums = [1,3,1,2,2]
Output: 4
Explanation: The complete subarrays are the following: [1,3,1,2], [1,3,1,2,2], [3,1,2] and [3,1,2,2].

Example 2:
Input: nums = [5,5,5,5]
Output: 10
Explanation: The array consists only of the integer 5, so any subarray is complete. The number of subarrays that we can choose is 10.
 

Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 2000    give solution in java

Solution
*/

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        // total distinct in the whole array
        boolean[] seen = new boolean[2001]; // nums[i] in [1,2000]
        int totalDistinct = 0;
        for (int x : nums) {
            if (!seen[x]) {
                seen[x] = true;
                totalDistinct++;
            }
        }

        int result = 0;
        // for every start index i, expand j until we collect all distinct values
        for (int i = 0; i < n; i++) {
            int[] freq = new int[2001];
            int curDistinct = 0;
            for (int j = i; j < n; j++) {
                int v = nums[j];
                if (freq[v] == 0) curDistinct++;
                freq[v]++;
                if (curDistinct == totalDistinct) {
                    // every subarray starting at i and ending at j..n-1 is complete
                    result += (n - j);
                    break;
                }
            }
        }
        return result;
    }
}
