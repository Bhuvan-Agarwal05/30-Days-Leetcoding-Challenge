class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack stack = new Stack();
        for(int i=0;i<S.length();i++)
            {
            if(S.charAt(i)>='a' && S.charAt(i)<='z')
           stack.push(S.charAt(i));
            else
               {
                if(!stack.isEmpty())
                    stack.pop();
                }
            }
        
        Stack stack2 = new Stack();
        for(int i=0;i<T.length();i++)
            {
            if(T.charAt(i)>='a' && T.charAt(i)<='z')
                stack2.push(T.charAt(i));
            else
               {
                if(!stack2.isEmpty())
                    stack2.pop();
               }
            }
        return stack.equals(stack2);
    }
}