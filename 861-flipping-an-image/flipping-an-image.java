class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int c = image[0].length, r = image.length;

        for (int row = 0; row < r; row++) {
            int start = 0, end = c - 1;

            while (start <= end) {
                int temp = 1 - image[row][start];
                image[row][start] = 1 - image[row][end];
                image[row][end] = temp;

                start++;
                end--;
            }
        }

        return image;
    }
}