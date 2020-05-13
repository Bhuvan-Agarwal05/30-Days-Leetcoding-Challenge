class Solution {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        if(row==0)
            return 0;
        int col = matrix[0].length;
        if(col==0)
            return 0;
        
        int maxSquare = 0;
        int[] sol = new int[col];
        
        int diag = matrix[0][0]=='0'?0:1;
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                int temp = sol[j];
                if(i==0 || j==0)
                {
                    if(matrix[i][j]=='1')
                    {
                        sol[j]=1;
                        maxSquare = Math.max(maxSquare,sol[j]);
                    }
                    else
                        sol[j]=0;
                }
                else
                {
                    if(matrix[i][j]=='1')
                    {
                        sol[j] = 1 + Math.min(Math.min(sol[j],sol[j-1]),diag);
                        maxSquare = Math.max(maxSquare,sol[j]);
                    }
                    else
                        sol[j]=0;
                }
                
                diag = (j==col-1)?sol[0]:temp;
            }
        }
        return maxSquare*maxSquare;
    }
}