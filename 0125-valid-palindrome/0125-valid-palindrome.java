class Solution {
    public boolean isPalindrome(String s) {

        if(s.isEmpty())
            return true;
            
        int l = s.length();
        int first = 0;
        int last = l - 1;

        s = s.toLowerCase();
        
        while(first <= last){

            char currFirst = s.charAt(first);
            char currLast = s.charAt(last);

            if(!Character.isLetterOrDigit(currFirst)){
                first++;
                continue;
            }
            if(!Character.isLetterOrDigit(currLast)){
                last--;
                continue;
            }
            if( currFirst != currLast)
            {
                return false;
            }
            first++;
            last--;
           
        }
        return true;
    }
}