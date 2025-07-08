class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet <Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }

        HashSet <Integer> res = new HashSet<>();

        for(int num : nums2) {
            if(set1.contains(num)){
                res.add(num);
            }
        }
        int res1[] = new int [res.size()];
        int i = 0;
        for(int num : res){
            res1[i++] = num ;
        }
        return res1;
    }
}