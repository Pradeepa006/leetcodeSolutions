class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer , Integer> map = new HashMap<>();

        int[] newarr = new int[2];
        int  l = nums.length;
        
        
        for(int i = 0 ; i < l ; i++)
        {
            int res = target - nums[i];

            if(map.containsKey(res)){
                newarr[0] = map.get(res);
                newarr[1] = i;
                break;
            }
            map.put(nums[i] , i);
            
        }
        return newarr;
    }
}