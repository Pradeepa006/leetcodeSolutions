class Solution {
    public boolean judgeCircle(String moves) {
        int[] freq = new int[2];
        for(int i = 0 ; i < moves.length() ; i++) {
            if(moves.charAt(i) == 'U')
                freq[0]++;
            else if(moves.charAt(i) == 'D')
                freq[0]--;
            else if(moves.charAt(i) == 'L')
                freq[1]++;
            else
                freq[1]--;
        }
        return freq[0] == 0 && freq[1] == 0;
        
    }
}