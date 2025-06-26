class Solution {
    public boolean isValid(String s) {

        char[] arr = s.toCharArray();
        int len = arr.length;

        char[] temp = new char[len];
        int top = -1 ;

        for (int i = 0 ; i < len ; i++)
        {
            if ( arr[i] == '(' || arr[i] == '[' || arr[i] == '{')
            {
                top++;
                temp[top] = arr[i];
                
            }
            else
            {
                if(top == -1)
                {
                    return false;
                }
                if((temp[top] == '{' && arr[i] == '}') || (temp[top] == '[' && arr[i] == ']') || (temp[top] == '(' && arr[i] == ')') )
                {
                    top--;
                }
                else{
                    return false;
                }
               

            }
        }

        if(top == -1)
        {
            return true;
        }
        else{
            return false;
        }
        

        
    }
}