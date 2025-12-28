class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0 ;
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0 ; i < row ; i++){
            int l = 0 , r = col - 1;
            while(l <= r){
                int mid = l + (r - l) / 2;
                if(grid[i][mid] < 0){
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            count += (col - l);
        }
        return count;
    }
}