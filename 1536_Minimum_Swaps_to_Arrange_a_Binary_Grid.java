/* 
1536. Minimum Swaps to Arrange a Binary Grid

Given an n x n binary grid, in one step you can choose two adjacent rows of the grid and swap them.
A grid is said to be valid if all the cells above the main diagonal are zeros.

Return the minimum number of steps needed to make the grid valid, or -1 if the grid cannot be valid.
The main diagonal of a grid is the diagonal that starts at cell (1, 1) and ends at cell (n, n).

Example 1:
Input: grid = [[0,0,1],[1,1,0],[1,0,0]]
Output: 3

Example 2:
Input: grid = [[0,1,1,0],[0,1,1,0],[0,1,1,0],[0,1,1,0]]
Output: -1
Explanation: All rows are similar, swaps have no effect on the grid.

Example 3:
Input: grid = [[1,0,0],[1,1,0],[1,1,1]]
Output: 0
 
Constraints:
n == grid.length == grid[i].length
1 <= n <= 200
grid[i][j] is either 0 or 1

Solution :
*/

class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int size = 1;
        while (size < n) size <<= 1;

        int[] maxT = new int[size << 1];
        int[] sumT = new int[size << 1];
        Arrays.fill(maxT, -1);

        for (int i = 0; i < n; i++) {
            int trail = 0;
            for (int j = n - 1; j >= 0 && grid[i][j] == 0; j--) trail++;
            maxT[size | i] = trail;
            sumT[size | i] = 1;
        }

        for (int i = size - 1; i > 0; i--) {
            maxT[i] = Math.max(maxT[i << 1], maxT[(i << 1) | 1]);
            sumT[i] = sumT[i << 1] + sumT[(i << 1) | 1];
        }

        int swap = 0;
        for (int i = 0; i < n; i++) {
            int req = n - 1 - i;
            if (maxT[1] < req) return -1;

            int idx = 1;
            while (idx < size) {
                if (maxT[idx << 1] >= req) {
                    idx <<= 1;
                } else {
                    swap += sumT[idx << 1];
                    idx = (idx << 1) | 1;
                }
            }

            maxT[idx] = -1;
            sumT[idx] = 0;
            
            for (int p = idx >> 1; p > 0; p >>= 1) {
                maxT[p] = Math.max(maxT[p << 1], maxT[(p << 1) | 1]);
                sumT[p] = sumT[p << 1] + sumT[(p << 1) | 1];
            }
        }

        return swap;
    }
}