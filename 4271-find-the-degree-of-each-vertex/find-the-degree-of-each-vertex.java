class Solution {
    public int[] findDegrees(int[][] matrix) {

        int n = matrix.length-1, count = 0;
        int result[] = new int[n+1];
        
        for (int i = 0; i <= n; i++) {
            count = 0;
            for (int j = 0; j <= n; j++) {
                if(matrix[i][j] == 1){
                    count++;
                }
            }

            result[i] = count;
            count = 0;
        }

        return result;
    }
}