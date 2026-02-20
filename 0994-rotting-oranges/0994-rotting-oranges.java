class Solution {
    public boolean safe(int i,int j,int n,int m){
        return (i>=0 && j>=0 && i<n && j<m);
    }
    public int orangesRotting(int[][] grid) {
        int d[][]={{-1,0},{0,-1},{0,1},{1,0}};
        boolean flag=false;
        int time=2;
        int n=grid.length;
        int m=grid[0].length;
       while(true){
        flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(grid[i][j]==time){
                for(int D[]:d){
                    int x=i+D[0];
                    int y=j+D[1];
                    if(safe(x,y,n,m) && grid[x][y]==1){grid[x][y]=grid[i][j]+1;flag=true;}
                }
              }
            }
        }
        if(!flag)break;
         time++;
       } 
       for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(grid[i][j]==1)return -1;
       return time-2;
    }
}