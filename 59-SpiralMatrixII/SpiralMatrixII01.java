class Solution {
    public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    int top = 0;
    int bottom = n - 1;
    int left = 0;
    int right = n - 1;
    int num = 1;
    while (top <= bottom && left <= right) {
        // Left to Right
        for (int i = left; i <= right; i++) {
            matrix[top][i] = num++;
        }
        top++;
        // Top to Bottom
        for (int i = top; i <= bottom; i++) {
            matrix[i][right] = num++;
        }
        right--;
        // Right to Left
        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;
        }
        // Bottom to Top
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
    }
    return matrix;
    }
}
