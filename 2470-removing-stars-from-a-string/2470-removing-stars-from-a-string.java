class Solution {
    public String removeStars(String s) {

        Stack<Character> st = new Stack<>();

        char[] arr = s.toCharArray();

        int l = arr.length;

        for (int i = 0 ; i < l ; i++){
            if(arr[i] == '*' && (!st.isEmpty())){
                st.pop();
            }
            else{
                st.push(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(char ch : st){
            sb.append(ch);
        }

        return sb.toString();
        
    }
}