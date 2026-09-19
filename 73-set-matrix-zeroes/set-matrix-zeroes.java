class Solution {
    public void setZeroes(int[][] matrix) {
        
        int r = matrix.length, c = matrix[0].length;
        boolean zeroinfirstcol = false;

        for(int row = 0; row < r; row++)
        {
            if(matrix[row][0] == 0) zeroinfirstcol = true;
            for(int col = 1; col < c; col++)
            {
                if(matrix[row][col] == 0)
                {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }
        
        for(int row = r-1; row >= 0; row--)
        {
            for(int col = c-1; col >= 1; col--)
            {
                if(matrix[row][0] == 0 || matrix[0][col] == 0)
                {
                    matrix[row][col] = 0;
                }
            }

            if(zeroinfirstcol)
            {
                matrix[row][0] = 0;
            }
        }           
    }
}