class Solution {
    public int numIslands(char[][] grid) {
        int a=0;
        int m=grid.length;
        int n=grid[0].length;
          boolean vist[][]= new boolean [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !vist[i][j]){
                    dfs(grid,vist,i,j);
                    a++;
                }
            }
        }
        return a;
    }
    public void dfs (char grid[][], boolean vist[][],int r,int c){
       int m = grid.length;
    int n = grid[0].length;

    if (r < 0 || r >= m || c < 0 || c >= n) return;
    if (grid[r][c] == '0' || vist[r][c]) return;

    vist[r][c] = true;

    dfs(grid, vist, r + 1, c);
    dfs(grid, vist, r - 1, c);
    dfs(grid, vist, r, c + 1);
    dfs(grid, vist, r, c - 1);
    }
   
}