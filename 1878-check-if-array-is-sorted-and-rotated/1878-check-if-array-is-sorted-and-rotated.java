class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return true;
        int[] arr = new int[2 * n];
        for(int i = 0 ; i < 2*n ; i++)
            arr[i] = nums[i % n];
        int c = 0;
        for(int i = 0 ; i < 2*n - 1 ; i++){
            if(arr[i] > arr[i + 1]){
                c = 0;
                continue;
            }
            else{
                c++;
                if(c == n - 1)
                    break;
            }
        } 
        if(c == n - 1)
            return true;
        else
            return false;   
    }
}