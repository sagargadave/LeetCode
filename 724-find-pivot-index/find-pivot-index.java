class Solution {
    public int pivotIndex(int[] nums) {
        
        int total = 0, leftsum = 0, n = nums.length;

        for(int no : nums)
        {
            total += no;
        }

        for(int i=0; i<n; i++)
        {
            int rightsum = total - leftsum - nums[i];

            if(rightsum == leftsum)
            {
                return i;
            }

            leftsum += nums[i];
        }

        return -1;
    }
}