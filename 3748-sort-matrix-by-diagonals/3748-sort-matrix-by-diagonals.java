class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(grid[i][j]);
            }
        }

        for (int key : map.keySet()) {
            List<Integer> diag = map.get(key);
            if (key >= 0) {
                diag.sort(Collections.reverseOrder());
            } else {
                Collections.sort(diag);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                grid[i][j] = map.get(key).remove(0); 
            }
        }

        return grid;
    }
}
