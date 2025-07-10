class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        int len = 0;
        int maxlen = 0;
        for(int i = 0 ; i < n ; i++){
            
            if(nums[i] > threshold){
                len = 0;
            }
            else if(len == 0){
                if (nums[i] % 2 == 0){
                    len = 1;
                }
                else{
                    len = 0;
                }

            }
            else if(i != 0 && nums[i] % 2 != nums[i - 1] % 2){
                len++;
            }
            else{
                if(nums[i] % 2 == 0){
                    len = 1;
                }
                else{
                    len = 0;
                }
            }
            maxlen = Math.max(len , maxlen);
            
        }
        return maxlen;
        
    }
}