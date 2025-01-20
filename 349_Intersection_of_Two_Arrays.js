/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 * 
 * Given two integer arrays nums1 and nums2, return an array of their intersection
 * Each element in the result must be unique and you may return the result in any order.
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 */
var intersection = function(nums1, nums2) 
{

    let nums = [];

    for(let i=0; i<nums1.length; i++)
    {
            if(nums2.includes(nums1[i]))
            if(!nums.includes(nums1[i]))
            nums.push(nums1[i]);
    }
      return nums;
};