class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i,flag=0,prod=1;
        int output[]=new int[nums.length];
        int count=0;
    for(i=0;i<nums.length;i++)
    {
        if(nums[i]==0)
        {
            flag=1;
            count++;
        }
    }
    if(flag==1)
    {
        if(count>1)
        {
            for(i=0;i<nums.length;i++)
                output[i]=0;
        }
        else
        {
            for(i=0;i<nums.length;i++)
            {
                if(nums[i]!=0)
                    prod *= nums[i];
            }
        
            for(i=0;i<nums.length;i++)
            {
                if(nums[i]!=0)
                    output[i] = 0;
                else
                    output[i] = prod;
            }
        }
    }
    else
    {
        for(i=0;i<nums.length;i++)
            prod *= nums[i];
        
        for(i=0;i<nums.length;i++)
        {
            output[i] = prod / nums[i];
        }
    }
        return output;
    }
}