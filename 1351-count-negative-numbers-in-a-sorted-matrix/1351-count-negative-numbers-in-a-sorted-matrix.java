class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        int n=grid.length;
        int m=grid[0].length;
       // for(int i=0;i<n;i++)for(int j=0;j<m;j++)if(grid[i][j]<0)c++;
       int i=n-1,j=0;
       while(i>=0 && j<m){
        if(grid[i][j]<0){c+=m-j;i--;}
        else j++;
       }
        return c;
    }
}