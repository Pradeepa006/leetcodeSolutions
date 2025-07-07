class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        // int j = 0;

        // for(int i = m  ; i < m + n ; i++) {
        //     nums1[i] = nums2[j];
        //     j++;
        // }
        // for(int i = 0 ; i < m+n ; i++){
        //     for(int j = i + 1; j < m + n ; j++){
        //         if(nums1[i] > nums1[j])
        //         {
        //             int temp = nums1[i];
        //             nums1[i] = nums1[j];
        //             nums1[j] = temp;
        //         }
        //     }
        // }
    }
}