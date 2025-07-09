class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length ;
        int left = 0 ; 
        int minlen = len + 1;
        int sum = 0;
        //int right = 0;

        for(int right = 0 ; right < len ; right++){

            sum = sum + nums[right];

            while(sum >= target){
                minlen = Math.min(minlen , right - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }
        if(minlen == len + 1){
            return 0;
        }
        else{
            return minlen;
        }
        
    }
}