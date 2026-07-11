class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int no : nums) {
            pq.add(no);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
}