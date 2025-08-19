class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c = 0;
        long numSubarray = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                numSubarray++;
            } else 
                numSubarray = 0;
            c += numSubarray;
        }
        return c;
    }
}
