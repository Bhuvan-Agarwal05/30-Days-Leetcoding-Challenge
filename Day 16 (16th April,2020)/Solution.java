class Solution {
    public boolean checkValidString(String s) {
        if(s.length()<1)
            return true;
        
        int bal=0;
        for(int i=0;i<s.length();i++)
            {
             if(s.charAt(i)==')')
                 bal--;
            else
                bal++;
            if(bal<0)
                return false;
            }
        if(bal==0)
            return true;
        bal=0;
        for(int i=s.length()-1;i>=0;i--)
            {
            if(s.charAt(i)=='(')
                bal--;
            else
                bal++;
            if(bal<0)
                return false;
            }
        return true;
    }
}