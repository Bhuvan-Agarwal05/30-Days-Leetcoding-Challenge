class Solution {
    ArrayList list = new ArrayList();
    public boolean isHappy(int n) {
        list.add(n);
        int rem,sum=0;
        int temp=n;
        while(temp!=0)
        {
            rem = temp % 10;
            sum += rem*rem;
            temp /= 10;
        } 
        if(sum==1)
            return true;
        
            if(list.contains(sum))
                return false;
            else
                return isHappy(sum);
    }   
}