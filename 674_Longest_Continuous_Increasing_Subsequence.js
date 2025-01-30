/**
 * @param {number[]} nums
 * @return {number}
 */
var findLengthOfLCIS = function(nums) 
{
    let result = 1, count = 1;

    if(nums.length == 0)
    {
        return 0;
    }

    for(let i=0; i<nums.length-1; i++)
    {
        if(nums[i] < nums[i+1])
        {
            count++; // [1,3,5,7]
        }
        else if(count > result)
        {
            result = count;
            count = 1;
        }
        else
        {
            count = 1;
        }
    }

    return result > count ? result : count;
};  