class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] width = new int[rows][cols];
        int maxArea = 0;

        //build width DP
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    width[i][j] = (j == 0) ? 1 : width[i][j - 1] + 1;
                }
            }
        }

        //calculate max rectangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (width[i][j] > 0) {
                    int minWidth = width[i][j];
                    for (int k = i; k >= 0; k--) {
                        if (width[k][j] == 0) break;
                        minWidth = Math.min(minWidth, width[k][j]);
                        maxArea = Math.max(maxArea, minWidth * (i - k + 1));
                    }
                }
            }
        }
        return maxArea;
    }
}
