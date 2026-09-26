class Solution {
    public int countNegatives(int[][] grid) {
        
        int row = grid.length, col = grid[0].length;

        int i = row-1, j = 0, result = 0;

        while(i >= 0 && j < col )
        {
            if(grid[i][j] < 0)
            {
                result += col-j;
                i--;                            
            }
            else
            {
                j++;
            }
        }

        return result;
    }
}