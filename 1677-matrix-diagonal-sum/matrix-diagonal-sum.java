class Solution {
    public int diagonalSum(int[][] mat) {

        int sum = 0, row = mat[0].length, col = mat.length, j = 0;

        for (int i = 0; i < col; i++) {
            
                if(i != ((row-1)-i)){
                    sum += mat[i][j];
                    sum += mat[i][(row-1)-i];
                }
                else
                {
                    sum += mat[i][j];
                }
                
                j++;
            }

        return sum;
    }
}