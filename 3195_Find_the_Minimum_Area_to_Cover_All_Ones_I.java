/*
3195. Find the Minimum Area to Cover All Ones I

You are given a 2D binary array grid. Find a rectangle with horizontal and vertical sides with the smallest area, such that all the 1's in grid lie inside this rectangle.
Return the minimum possible area of the rectangle.

Example 1:
Input: grid = [[0,1,0],[1,0,1]]
Output: 6
Explanation:
The smallest rectangle has a height of 2 and a width of 3, so it has an area of 2 * 3 = 6.

Example 2:
Input: grid = [[1,0],[0,0]]
Output: 1
Explanation:
The smallest rectangle has both height and width 1, so its area is 1 * 1 = 1.

Constraints:
1 <= grid.length, grid[i].length <= 1000
grid[i][j] is either 0 or 1.
The input is generated such that there is at least one 1 in grid.

Solution :
*/

class Solution {
    public int minimumArea(int[][] grid) {

        int t_row = Integer.MAX_VALUE;
        int b_row = 0;

        int r_col = Integer.MAX_VALUE;
        int l_col = 0;

        int rows = grid.length;
        int coln = grid[0].length;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < coln; j++) {

                if (grid[i][j] == 1) {
                    
                    t_row = Math.min(t_row, i);

                    b_row = Math.max(b_row, i);

                    r_col = Math.min(j, r_col);

                    l_col = Math.max(l_col, j);
                }
            }
        }

        int h = Math.abs(t_row - b_row) + 1;
        int w = Math.abs(l_col - r_col) + 1;

        return h * w;
    }
}