class Solution {
    public int countNegatives(int[][] grid) {

        int c = grid[0].length-1, r = grid.length-1, ind = 0, result = 0;

        for(int row = r; row >= 0; row--)
        {
            for( int col = ind; col <=c; col++)
            {
                if(grid[row][col] < 0)
                {
                    ind = col;
                    result += c-col+1;
                    break;
                }
            }
        }

        return result;
    }
}

/* 

 4  3  2 -1
 3  2  1 -1
 1  1 -1 -2
-1 -1 -2 -3

*/