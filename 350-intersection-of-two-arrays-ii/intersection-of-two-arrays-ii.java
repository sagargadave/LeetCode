class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int no : nums1) {
            mp.put(no, mp.getOrDefault(no, 0) + 1);
        }

        for (int no : nums2) {

            if (mp.containsKey(no) && mp.get(no) > 0) {

                list.add(no);
                mp.put(no, mp.get(no) - 1);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}