class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        ArrayList<Integer> minList = new ArrayList<>();
        ArrayList<Integer> maxList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        int col = matrix.length, row = matrix[0].length;

        for (int i = 0; i < col; i++) {
            int min = matrix[i][0];

            for (int j = 0; j < row; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }

            minList.add(min);
        }

        for (int i = 0; i < row; i++) {
            int max = matrix[0][i];

            for (int j = 0; j < col; j++) {
                if (max < matrix[j][i]) {
                    max = matrix[j][i];
                }
            }

            maxList.add(max);
        }

        for (int i = 0; i < minList.size(); i++) {
            if (maxList.contains(minList.get(i))) {
                result.add(minList.get(i));
            }
        }

        return result;
    }
}