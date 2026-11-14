class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0;
        int col = 0;
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];
            if ((row + col) % 2 == 0) {
                // Moving up-right
                if (col == n - 1) {
                    row++;
                } 
                else if (row == 0) {
                    col++;
                } 
                else {
                    row--;
                    col++;
                }
            } else {
                // Moving down-left
                if (row == m - 1) {
                    col++;
                } 
                else if (col == 0) {
                    row++;
                } 
                else {
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}