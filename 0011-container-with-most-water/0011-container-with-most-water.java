class Solution {
    public int maxArea(int[] height) {

        int maxarea = 0;
        int left =  0;
        int right = height.length - 1 ;

        while(left < right){
            int h = Math.min(height[left] , height[right]);
            int w = right - left;
            int area = h * w;
            maxarea = Math.max(area , maxarea);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;

        // int max = height[0];
        // int maxi = 0;
        // int area ;
        // int maxarea = 0;
        // for(int i = 1 ; i < height.length ; i++){
        //     if(max < height[i]){
        //         max = height[i];
        //         maxi = i;
        //         continue;
        //     }
        //     area = Math.min(max , height[i]) * (i - maxi);
        //     maxarea = Math.max(area , maxarea);
        // }
        // return maxarea;
    }
}