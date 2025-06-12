class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length())
            return false;

        String combined_str = s + s;

        if(combined_str.contains(goal))
            return true;
        
        return false;
    }
}