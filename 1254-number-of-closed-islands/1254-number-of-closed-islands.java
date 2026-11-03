class Solution {
    public int closedIsland(int[][] grid) {
       int m=grid.length;
       int n=grid[0].length;
        for (int i = 0; i < m; i++) {
            dfs(i, 0, m, n, grid);
            dfs(i, n - 1, m, n, grid);
        }

        for (int j = 0; j < n; j++) {
            dfs(0, j, m, n, grid);
            dfs(m - 1, j, m, n, grid);
        }
       int c=0;
       for(int i=0;i<m;i++)for(int j=0;j<n;j++)if(grid[i][j]==0){c++;dfs(i,j,m,n,grid);}
       return c; 
    }
    public void dfs(int x,int y,int m,int n,int grid[][]){
        if(x<0 || y<0 || x>=m || y>=n || grid[x][y]==1)return ;
        grid[x][y]=1;
        dfs(x-1,y,m,n,grid);
        dfs(x+1,y,m,n,grid);
        dfs(x,y-1,m,n,grid);
        dfs(x,y+1,m,n,grid);
    }
}