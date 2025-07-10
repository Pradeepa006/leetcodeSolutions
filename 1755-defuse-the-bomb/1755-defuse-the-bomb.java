class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];

        if(k == 0){
            return arr;
        }

        int[] cirArr = new int[2 * n];

        for(int i = 0 ; i < 2 * n ; i++)
        {
            cirArr[i] = code[i % n];
        }

        int start , end;

        if (k > 0){
            start = 1;
            end = k;
        }
        else{
            start = n + k;
            end = n - 1;
        }
        int sum = 0;
        

        for(int i = start ; i <= end ; i++){
            sum = sum + cirArr[i];
        }
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = sum;
            sum = sum + cirArr[i + end + 1 ];
            sum = sum - cirArr[start + i];
        }

        // for(int i = 0 ; i < n ; i++){
        //     int sum = 0;
        //     if(k > 0){
        //         for(int j = 1 ; j <= k ; j++){
        //             sum = sum + code[(i + j) % n];
        //         }
        //     }
        //     if( k < 0){
        //         for(int j = -1 ; j >= k ; j--){
        //             sum = sum + code[(i + j + n) % n];
        //         }
        //     }
        //     arr[i] = sum;
        // }
        return arr;
        
    }
}