class Solution {
    public int maxCount(int m, int n, int[][] ops) 
    {         
        for (int i = 0; i < ops.length; i++) 
        {
            if(m > ops[i][0])
            {
                m = ops[i][0];
            }

            if(n > ops[i][1])
            {
                n = ops[i][1];
            }
        }

        return m * n;
    }
}