class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;
        long maxSum = 0;
        int left = 0;
        long currSum = 0;

        Set<Integer> set = new HashSet<>();

        for(int right = 0 ; right < n ; right++){

            while(set.contains(nums[right])){
                currSum = currSum - nums[left];
                set.remove(nums[left]);
                left++;
            }

            currSum = currSum + nums[right];
            set.add(nums[right]);

            if(right - left + 1 == k){
                if(currSum > maxSum){
                    maxSum = currSum;
                }
                
                currSum = currSum - nums[left];
                set.remove(nums[left]);
                left++;
            }
           
        }
        return maxSum;
        
    }
}