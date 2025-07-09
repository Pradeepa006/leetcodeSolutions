class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int n = nums.length;
       
        int right =  1;

        for(int left = 0 ; left < n - 1 ; left++ )
        {
            right = left + 1;
            while (Math.abs(right - left) <= k && right < n){
                if(nums[right] == nums[left]){
                    return true;
                }
                right++;
            }

        }
        return false;
        

        // while(right < n){
        //     if(nums[left] == nums[right]){
        //         return true;
        //     }
        //     left++;
        //     right++;
        // }

        //return false;
        
    }
}