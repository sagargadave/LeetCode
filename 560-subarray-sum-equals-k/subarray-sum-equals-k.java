class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);

        int total = 0, n = nums.length, result = 0;

        for (int i = 0; i < n; i++) {

            total += nums[i];

            if (mp.containsKey(total - k)) {
                result += mp.get(total - k);
            }

            mp.put(total, mp.getOrDefault(total, 0) + 1);
        }

        return result;
    }
}