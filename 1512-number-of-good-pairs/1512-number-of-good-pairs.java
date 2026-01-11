class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        int goodpairs = 0;
        for (Integer value : map.values()) {
            if(value >= 2) {
                goodpairs += value * (value - 1) / 2;
            }
        }
        return goodpairs ;
    }
}