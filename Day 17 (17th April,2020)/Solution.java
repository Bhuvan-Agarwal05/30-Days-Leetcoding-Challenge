class Solution {
    public int numIslands(char[][] grid) {
        int h = grid.length;
        if(h==0) return 0;
        int w = grid[0].length;
        if(w==0) return 0;
        
        int c=0;
        for(int i=0;i<h;i++)
            {
            for(int j=0;j<w;j++)
                {
                if(grid[i][j]=='1')
                    {
                    c++;
                    dfs(grid,i,j);
                    }
                }
            }
        return c;
        }
    
    public void dfs(char [][]grid,int x,int y)
        {
        grid[x][y]='0';
        if(x+1<grid.length && grid[x+1][y]=='1')
            dfs(grid,x+1,y);
        if(x-1>=0 && grid[x-1][y]=='1')
            dfs(grid,x-1,y);
        if(y-1 >=0 && grid[x][y-1]=='1')
            dfs(grid,x,y-1);
        if(y+1<grid[0].length && grid[x][y+1]=='1')
            dfs(grid,x,y+1);
        }
    

    
}