class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int col = image.length, row = image[0].length;

        int start = 0;

        for (int i = 0; i < col; i++) {
            int end = row - 1;
            start = 0;
            while (start <= end) {
                int temp = 1 - image[i][start];
                image[i][start] = 1 - image[i][(row - 1) - start];
                image[i][(row - 1) - start] = temp;
                start++;
                end--;
            }
        }

        return image;
    }
}