class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int l = nums.length;
        // int[] arr = new int[l];
        // int product;

        // for(int i = 0 ; i < l ; i++){
        //     product = 1;
        //     for (int j = 0 ; j < l ; j++){
        //         if(i != j){
        //             product = product * nums[j];
        //         }
        //         else{
        //             product = product;
        //         }
        //     }
        //     arr[i] = product;
        // }
        // return arr;

        int l = nums.length;
        int[] arr = new int[l];
        arr[0] = 1;
        int product = 1;

        for(int i = 1; i < l ; i++){

            arr[i] = arr[i - 1] * nums[i - 1];
        }

        for(int i = l - 1 ; i >= 0 ; i--)
        {
            arr[i] = product * arr[i];
            product = product * nums[i];
        }
        return arr;
    }
}