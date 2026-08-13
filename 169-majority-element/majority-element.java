class Solution {
    public int majorityElement(int[] nums) {

        int result = 0, value = 0, maxvalue = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int no : nums) {
            value = mp.getOrDefault(no, 0) + 1;
            mp.put(no, value);

            if (value > maxvalue) {
                maxvalue = value;
                result = no;
            }
        }

        return result;
    }
}