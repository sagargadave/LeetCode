class Solution {
    public void rotate(int[][] matrix) {
        
        int r = matrix.length, c = matrix[0].length;

        for(int row = 0; row < r/2; row++)
        {
            for(int col = 0; col < c; col++)
            {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[c-row-1][col];
                matrix[c-row-1][col] = temp;
            }
        }

        for(int col = 0; col < c; col++)
        {
            for(int j=col+1; j<c; j++)
            {
                int temp = matrix[col][j];
                matrix[col][j] = matrix[j][col];
                matrix[j][col] = temp;
            }
        }
    }
}