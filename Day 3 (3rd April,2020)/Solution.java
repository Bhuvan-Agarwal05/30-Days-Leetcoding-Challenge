class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int max_sofar=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max_sofar = maximum(nums[i],nums[i]+max_sofar);
            if(max_sofar>max)
                max=max_sofar;
        }
        return max;
    }
    public int maximum(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
}