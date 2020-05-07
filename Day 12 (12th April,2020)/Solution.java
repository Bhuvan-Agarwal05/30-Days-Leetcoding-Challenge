class Solution {
    public int lastStoneWeight(int[] stones) {
        int x,y,i=stones.length;
        if(i==0)
            return 0;
        else if(i==1)
            return stones[0];
        else{
        while(true)
          {
            Arrays.sort(stones);
            y=stones[i-1];
            x=stones[i-2];
            if(x==y)
                i-=2;
            if(x<y)
              {
                stones[i-2]=y-x;
                i--;
              }
            if(i==1 || i==0)
                break;
          } 
            }
         if(i==0)
             return 0;
        else
            return stones[0];
    }
}