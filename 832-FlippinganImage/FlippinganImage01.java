class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int left = 0;
            int right = row.length - 1;
            while (left <= right) {
                int temp = row[left] ^ 1;
                row[left] = row[right] ^ 1;
                row[right] = temp;
                left++;
                right--;
            }
        }
        return image;
    }
}