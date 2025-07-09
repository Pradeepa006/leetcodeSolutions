class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int left =  0;

        for(int right = 0 ; right < n ; right++ )
        {
            if(set.contains(nums[right])){
                return true;
            }
            set.add(nums[right]);
            //left++;
            if( Math.abs(left - right) + 1 > k){
                set.remove(nums[left]);
                left++;
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