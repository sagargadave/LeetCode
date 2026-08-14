class Solution {
    public List<Integer> majorityElement(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        int result1 = 0, result2 = 0, count1 = 0, count2 = 0, n = nums.length;

        for (int i = 0; i < n; i++) {

            if (result1 == nums[i]) {
                count1++;
            } else if (result2 == nums[i]) {
                count2++;
            } else if (count1 == 0) {
                result1 = nums[i];
                count1++;
            } else if (count2 == 0) {
                result2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < n; i++) {
            if (result1 == nums[i]) {
                count1++;
            } else if (result2 == nums[i]) {
                count2++;
            }
        }

        if (count1 > n / 3) {
            list.add(result1);
        }

        if (count2 > n / 3) {
            list.add(result2);
        }

        return list;
    }
}