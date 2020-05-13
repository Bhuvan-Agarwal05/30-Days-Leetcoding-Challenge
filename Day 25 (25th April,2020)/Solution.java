class Solution {
    public boolean canJump(int[] nums) {
        int index=nums.length-1;
        for(int i=index;i>=0;i--)
        {
            if(i+nums[i]>=index)
                index=i;
        }
        return index==0;
    }
}