class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum = sum + nums[i];
        }
        double mavg = sum / (double)k;
        int maxSum =  sum ;
        sum = sum - nums[0];

        for(int i = k ; i < nums.length ; i++){

            sum = sum + nums[i];
            maxSum = Math.max(maxSum , sum);
            sum = sum - nums[i - k + 1];
        }

        mavg = maxSum / (double)k;

        return mavg;
        
    }
}