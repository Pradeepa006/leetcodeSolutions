class Solution {
    public boolean validPalindrome(String s) { 

        int n = s.length();
        int j = n - 1;
        int i = 0 ;
        
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                if(ispalindrome(s , i + 1 , j) || ispalindrome(s , i , j - 1))
                {
                    return true ;
                }
                return false;
            } else{
                j--;
                i++;
            }
        }
        return true;
    }
    private boolean ispalindrome(String s , int i , int j){
        while(i < j){
           if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
        
    
}