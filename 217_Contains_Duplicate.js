/*

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 Input: nums = [1,2,3,1]

Output: true

*/

/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) 
{ 
    nums.sort();

    for(let i=0; i<nums.length-1; i++)
    {
        if(nums[i] == nums[i+1])
        {
            return true;
        }
    }

    return false;
    
};