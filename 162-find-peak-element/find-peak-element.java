class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        
        int ind = 0, n = nums.length, result = 0, max = 0;

        if(n == 2)
        {
            if(nums[0] > nums[1])
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }

        for(int i=1; i<n-1; i++)
        {
            if( ((nums[i-1] < nums[i]) && (nums[i] > nums[i+1])) )
            {
                return i;
            }
            else if( nums[i-1] > nums[i] && nums[i-1] > max)
            {
                max = nums[i-1];
                result = i-1;
            }
            else if(nums[i+1] > nums[i] && nums[i+1] > max)
            {
                max = nums[i+1];
                result = i+1;
            }
        }

        return result;
    }
}