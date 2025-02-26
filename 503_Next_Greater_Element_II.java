class Solution 
{
    public int[] nextGreaterElements(int[] nums) 
    {
        int [] result = new int[nums.length];
        int n = nums.length-1,k = 0;

        for(int i=0; i<=n; i++)
        {
            int itr = n; 
            int j = 0; 

            if(i == n)
            {
                 j = 0;
            }
            else
            {
                j = i+1;
            }

            while(itr != 0)
            {
                if(nums[i] < nums[j])
                {
                    result[k++] = nums[j];
                    break;
                }

                j++;

                if(j==n+1) 
                {
                    j = 0;
                }
                
                itr = itr-1;
            }

            if(itr == 0)
            {
                result[k++] = -1;
            }
            
        }

        return result;
    }
}