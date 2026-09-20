class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean visit[][]= new boolean[m][n];
        int dist[][]= new int[m][n];
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<m;i++)for(int j=0;j<n;j++)if(grid[i][j]==0){q.add(new int[]{i,j,0});visit[i][j]=true;}
        int dr[]={-1,0,0,1};
        int dc[]={0,-1,1,0};
        while(!q.isEmpty()){

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];
            int d = curr[2];

            dist[r][c] = d;

            for(int i=0;i<4;i++){

                int nr = r + dr[i];
                int nc = c + dc[i];

                if(nr<0 || nc<0 || nr>=m || nc>=n || visit[nr][nc])
                    continue;

                visit[nr][nc] = true;
                q.offer(new int[]{nr,nc,d+1});
            }
        }
        return dist;
    }
}