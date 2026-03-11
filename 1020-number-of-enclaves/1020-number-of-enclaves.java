class Solution {
    public int numEnclaves(int[][] grid) {
     int m= grid.length;
     int n= grid[0].length;
     boolean visit[][]= new boolean[m][n];
     Queue<int[]> q= new LinkedList<>();
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(i==0||j==0||i==m-1||j==n-1){
                if(grid[i][j]==1 && !visit[i][j]){visit[i][j]=true;q.offer(new int[]{i,j});}
            }
        }
     }
     int dr[]={-1,0,1,0};
     int dc[]={0,1,0,-1};
     while(!q.isEmpty()){
        int curr[]=q.poll();
        for(int k=0;k<4;k++){
            
            int nr=curr[0]+dr[k];
            int nc=curr[1]+dc[k];
            if(nr>=0 && nr<m && nc>=0 && nc<n && !visit[nr][nc] && grid[nr][nc]==1){visit[nr][nc]=true;q.offer( new int[]{nr,nc});}
        }
     }
     int c=0;
     for(int i=0;i<m;i++)for(int j=0;j<n;j++)if(grid[i][j]==1 && !visit[i][j])c++;
     return c;
    }
}