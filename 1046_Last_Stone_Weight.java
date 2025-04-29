class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }

        Arrays.sort(stones);

        int i = stones.length - 1;

        while (true) {
            int ist1 = stones[i];
            int ist2 = stones[i - 1];

            if (ist1 != -1 && ist2 != -1 && ist1 == ist2) {
                stones[i] = -1;
                stones[i - 1] = -1;
            } else if (ist1 != -1 && ist2 != -1) {
                stones[i] = Math.abs(stones[i] - stones[i - 1]);
                stones[i - 1] = -1;
            }

            Arrays.sort(stones);

            if (stones[stones.length - 2] == -1) {
                break;
            } else {
                i = stones.length - 1;
            }
        }

        if (stones[stones.length - 1] == -1) {
            return 0;
        }

        return stones[stones.length - 1];
    }
}