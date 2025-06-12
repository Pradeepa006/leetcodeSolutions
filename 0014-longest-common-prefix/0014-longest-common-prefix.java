class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        
        int i;
        for(i = 0 ; i < Math.min(first.length(), last.length()) ; i++){

            if(first.charAt(i) != last.charAt(i))
                break;
        }
        
        return first.substring(0,i);
    }
}