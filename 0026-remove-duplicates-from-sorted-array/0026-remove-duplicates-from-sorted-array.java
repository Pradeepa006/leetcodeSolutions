class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];
        int i ;
        int j = 0;
        for(i = 1 ; i < n  ; i++){
           
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        
        return j + 1;

        
    }
}