class Solution {
    public int findGCD(int[] nums) {
        
        int min = nums[0], max = nums[0];

        for(int no : nums)
        {
            min = Math.min(min, no);
            max = Math.max(max, no);            
        }
        
        for(int i=max; i>=1; i--)
        {
            if(min % i == 0 && max % i == 0)
            {
                return i;
            }
        }

        return 1;
    }
}