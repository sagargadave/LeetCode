class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int n = height.length;
        List<Integer> res = new ArrayList<>();
        
        for (int i = 1; i < n; ++i)
            if (height[i - 1] > threshold)
                res.add(i);
        
        return res;
    }
}