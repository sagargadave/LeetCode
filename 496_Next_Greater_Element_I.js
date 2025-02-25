/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var nextGreaterElement = function(nums1, nums2) 
{
    let result = [];

    for(let i=0; i<nums1.length; i++)
    {
        for(let j=0; j<nums2.length; j++)
        {
            if(nums1[i] == nums2[j])
            {   
                for(let k=j; k<nums2.length; k++)
                {
                    if(nums2[k] > nums1[i])
                    {
                        console.log(nums2[k]);
                        result.push(nums2[k]);
                        break;
                    }
                    else if(k == nums2.length-1)
                    {
                        result.push(-1);    
                        break;
                    }            
                }
                break;
            }
        }
    }

    return result;
};