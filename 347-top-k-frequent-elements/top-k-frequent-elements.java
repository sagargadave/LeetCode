class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int no : nums) {
            mp.put(no, (mp.getOrDefault(no, 0) + 1));
        }

        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> mp.get(n1) - mp.get(n2));

        for (int n : mp.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        int arr[] = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = heap.poll();
        }

        return arr;
    }
}