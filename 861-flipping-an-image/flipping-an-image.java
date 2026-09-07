class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int col = image.length, row = image[0].length;

        for (int i = 0; i < col; i++) {
            int start = 0, end = row - 1;

            while (start <= end) {
                int temp = 1 - image[i][start];
                image[i][start] = 1 - image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }

        return image;
    }
}