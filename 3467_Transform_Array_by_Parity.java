class Solution 
{
    public int[] transformArray(int[] nums) 
    {
        int n = nums.length, E = 0, O = n-1;
        int result[] = new int[n];
            
        for(int i=0; i<n; i++)    
        {
            if(nums[i] % 2 == 0)
            {
                result[E++] = 0;
            }
            else
            {
                result[O--] = 1;
            }
        }

        return result;
    }
}