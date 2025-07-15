class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int d1 = 0;
        int d2 = 0;

        for(int i = cost.length - 1 ; i >= 0 ; i--){
            int cur = cost[i] + Math.min(d1,d2);
            d2 = d1;
            d1 = cur;
        }
        return Math.min(d1,d2);
    }
}