class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        for (int k = Math.min(m, n); k >= 2; k--) {
            for (int i = 0; i + k <= m; i++) {
                for (int j = 0; j + k <= n; j++) {

                    if (isMagic(grid, i, j, k))
                        return k;
                }
            }
        }
        return 1; // 1x1 is always magic
    }

    private boolean isMagic(int[][] g, int r, int c, int k) {

        int target = 0;
        for (int j = c; j < c + k; j++)
            target += g[r][j];

        // check rows
        for (int i = r; i < r + k; i++) {
            int sum = 0;
            for (int j = c; j < c + k; j++)
                sum += g[i][j];
            if (sum != target) return false;
        }

        // check columns
        for (int j = c; j < c + k; j++) {
            int sum = 0;
            for (int i = r; i < r + k; i++)
                sum += g[i][j];
            if (sum != target) return false;
        }

        // diagonals
        int d1 = 0, d2 = 0;
        for (int i = 0; i < k; i++) {
            d1 += g[r + i][c + i];
            d2 += g[r + i][c + k - 1 - i];
        }

        return d1 == target && d2 == target;
    }
}
