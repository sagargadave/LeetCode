class Solution {
    public int diagonalSum(int[][] mat) {

        int sum = 0, row = mat[0].length, col = mat.length;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (j == i || j == (row - 1) - i) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}