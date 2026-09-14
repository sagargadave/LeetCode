class Solution {
    public void rotate(int[][] matrix) {
        
        int col = matrix.length, row = matrix[0].length;

        for(int i=0; i<row; i++)
        {
            int start = 0, end = col-1;

            while(start <= end)
            {
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
                start++;
                end--;
            }

        }

        for(int i=0; i<col; i++)
        {
            for(int j = i+1; j<col; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}