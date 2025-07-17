class Solution {
    public static boolean isContains(String s , char x){
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == x)
            return true;
        }
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        //int arr[] = new arr[2];
        for(int i = 0 ; i < words.length ; i++){
            if(isContains(words[i] , x)){
                res.add(i);
            }
        }
        return res;
    }
}