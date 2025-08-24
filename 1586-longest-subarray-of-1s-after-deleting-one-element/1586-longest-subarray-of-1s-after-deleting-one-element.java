class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0 ;
        int c = 0 ;
        int len = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                c++;
            }
            while(c > 1){
                if(nums[l] == 0){
                    c--;
                }
                l++;
            }
            len = Math.max(len , i - l);
        }
        
        return len;
    }
}