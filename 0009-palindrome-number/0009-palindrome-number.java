class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0)
            return false;
    
        int copy = x ;
        int rev = 0;

        while(x != 0){

            int rem = x % 10;
            x = x / 10;
            rev = rev * 10 + rem;
        }

        if( rev == copy)
            return true;

        return false ;
    }
}