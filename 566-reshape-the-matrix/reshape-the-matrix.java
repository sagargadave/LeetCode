class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int row = mat.length, col = mat[0].length;

        if ((row * col) != (r * c)) {
            return mat;
        }

        int result[][] = new int[r][c];
        int o_rows = 0, o_col = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[o_rows][o_col] = mat[i][j];
                o_col++;

                if (o_col == c) {
                    o_col = 0;
                    o_rows++;
                }
            }
        }

        return result;
    }
}