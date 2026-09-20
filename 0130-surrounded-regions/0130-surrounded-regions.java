class Solution {
    public void solve(char[][] board) {
      int m=board.length;
      int n=board[0].length;
      if(board.length == 1 || board[0].length == 1)
    return;
      boolean[][] visit= new boolean[m][n];
      char N[][]= new char[m][n];
      for(int i=0;i<m;i+=m-1)for(int j=0;j<n;j++){
        if(board[i][j]=='O' && !visit[i][j])
        dfs(i,j,visit,board,N);
      }
      for(int j=0;j<n;j+=n-1)for(int i=1;i<m-1;i++){
        if(board[i][j]=='O' && !visit[i][j])
        dfs(i,j,visit,board,N);
      }
      for(int i=0;i<m;i++)for(int j=0;j<n;j++){
        if(N[i][j]!='O')board[i][j]='X';
      }
    }
    public void dfs(int i,int j,boolean visit[][],char board[][],char N[][]){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || visit[i][j]||board[i][j]=='X')return ;
        visit[i][j]=true;
        N[i][j]='O';
        dfs(i-1,j,visit,board,N);
        dfs(i,j-1,visit,board,N);
        dfs(i,j+1,visit,board,N);
        dfs(i+1,j,visit,board,N);
    }
}