class Solution {
    public int findClosest(int x, int y, int z) 
    {
        int result1 = 0;
        int result2 = 0;

        if(z > x)
        {
            result1 = z-x;
        }
        else
        {
            result1 = x-z;
        }

        if(z>y)
        {
            result2 = z-y;
        }
        else
        {
            result2 = y-z;
        }

        if(result1 > result2)
        {
            return 2;
        }
        else if (result1 < result2)
        {
            return 1;
        }

        return 0;
    }
}