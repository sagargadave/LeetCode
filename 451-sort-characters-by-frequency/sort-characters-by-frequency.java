class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> mp = new HashMap<>();

        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> (mp.get(b) - mp.get(a)));

        pq.addAll(mp.keySet());

        StringBuilder result = new StringBuilder();

        while (!pq.isEmpty()) {

            char c = pq.poll();
            int freq = mp.get(c);

            while (freq > 0) {
                freq--;
                result.append(c);
            }
        }

        return result.toString();
    }
}