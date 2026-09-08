class Solution {
    public int countNegatives(int[][] grid) {

        int counter = 0, col = grid.length, row = grid[0].length, ind = 0;

        for (int i = col - 1; i >= 0; i--) {
            for (int j = ind; j < row; j++) {
                if (grid[i][j] < 0) {
                    counter += row - j;
                    ind = j;
                    break;
                }
            }
        }

        return counter;
    }
}
/*

 4   3  2 -1
 3   2  1 -1
 1   1 -1 -2
-1  -1 -2 -3

*/