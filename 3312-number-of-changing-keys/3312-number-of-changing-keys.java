class Solution {
    public int countKeyChanges(String s) {
        int c = 0;
        for(int i = 0 ; i < s.length() - 1 ; i++){
            char ch = s.charAt(i);
            if(ch == s.charAt(i + 1) || (char)(ch + 32) == s.charAt(i + 1)  || (char)(ch - 32) == s.charAt(i + 1))
                c = c ;
            else
                c++;
        }
        return c;
    }
}