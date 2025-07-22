class Solution {
    public int maxOperations(int[] nums, int k) {
        // Set<Integer> s = new HashSet<>();
        // for(int i = 0 ; i < nums.length ; i++)
        //     s.add(nums[i]);
        // int c = 0;
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(k < nums[i])
        //         continue;
        //     if(s.contains(k - nums[i]) ){
        //         c++;
        //         s.remove(nums[i]);
        //         s.remove(k - nums[i]);
        //     }
        // }
        // return c;

        Arrays.sort(nums);
        int i = 0;
        int c = 0;
        int j = nums.length - 1;
        while(i < j) {
            int sum = nums[i] + nums[j];
            if(sum == k){
                c++;
                i++;
                j--;
            }
            if(k < sum)
                j--;
            if(k > sum)
                i++;
        }
        return c;
    }
}