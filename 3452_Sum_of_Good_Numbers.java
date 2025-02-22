class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) 
    {
        int sum = 0;

        for(int i=0; i<nums.length; i++)    
        {
            int ind1 = i-k;
            int ind2 = i+k;
            int flag = 0;

            if((ind1 >=0 && ind1<nums.length))
            {
                if(nums[ind1] < nums[i])
                {
                    flag++;
                }
            }
            else
            {
                flag++;
            }

            if(ind2 >=0 && ind2<nums.length)
            {
                if(nums[ind2] < nums[i])
                {
                    flag++;
                }
            }
            else
            {
                flag++;
            }

            if(flag == 2)
            {
                sum += nums[i];
            }
        }

        return sum;
    }
}