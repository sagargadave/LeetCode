class Solution {
    public int countLargestGroup(int n) {
        if (n <= 9) {
            return n;
        } else {
            ArrayList<Integer> l1 = new ArrayList<>(n);
            l1.add(0);

            for (int i = 1; i <= n; i++) {
                int num = i, sum = 0;
                l1.add(0);

                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }

                num = l1.get(sum);
                l1.set(sum, num + 1);
            }
            int max = Collections.max(l1);
            int freq = Collections.frequency(l1, max);

            return freq;
        }
    }
}