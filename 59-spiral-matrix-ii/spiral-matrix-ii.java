class Solution {
    public int[][] generateMatrix(int n) {
        
        int top = 0, bottom = n-1;
        int right = n-1, left = 0;
        int element = 1;
        int matrix[][] = new int [n][n];

        while(top <= bottom && left <= right)
        {
            for(int i = left; i<=right; i++)
            {
                matrix[top][i] = element++;
            }

            top++;

            for(int j=top; j<=bottom; j++)
            {
                matrix[j][right] = element++;
            }

            right--;

            if(top <= bottom)
            {
                for(int k = right; k>=left; k--)
                {
                    matrix[bottom][k] = element++;
                }

                bottom--;
            }

            if(left <= right)
            {
                for(int l = bottom; l >= top; l--)
                {
                    matrix[l][left] = element++;
                }

                left++;
            }            
        }

        return matrix;    
    }
}