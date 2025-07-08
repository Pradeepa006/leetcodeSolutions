class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();
        int l = 0;
        int r = 0;
        while(r < a.length){
            if(a[r] == ' ')
            {
                reverse(a , l , r - 1);
                l = r + 1;
            }
            r++;
        }
        reverse(a , l , r - 1);
        return new String(a);
        
    }
    private void reverse(char[] a , int l , int r){
        while( l < r){
            char t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
    }
}