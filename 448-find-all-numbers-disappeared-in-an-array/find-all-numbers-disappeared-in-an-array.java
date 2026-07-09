class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int n = nums.length, sum = 0, sum1 = 0;

        for (int i = 0; i < n; i++) {
            int no = nums[Math.abs(nums[i]) - 1];

            if (no > 0) {
                nums[Math.abs(nums[i]) - 1] = no * -1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }

        return list;
    }
}