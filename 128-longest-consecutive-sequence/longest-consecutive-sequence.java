class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int no : nums) {
            set.add(no);
        }

        int result = 0;

        for (int no : set) {
            if (!set.contains(no - 1)) {
                int len = 1;

                while (set.contains(no + len)) {
                    len++;
                }

                result = Math.max(len, result);
            }
        }

        return result;
    }
}