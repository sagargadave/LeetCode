class Solution {
    public int maximumProduct(int[] nums) 
    {   
        Arrays.sort(nums);

        int sum1 = nums[0]*nums[1]*nums[nums.length-1];
        int sum2 = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];

        sum1 = Integer.max(sum1,sum2);

        return sum1;
    }

}