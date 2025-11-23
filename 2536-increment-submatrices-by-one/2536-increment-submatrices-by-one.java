class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
      int a[][] = new int[n][n];
      for(int i=0;i<n;i++)for(int j=0;j<n;j++)a[i][j]=0;
      int row1=0,col1=0,row2=0,col2=0;
      for(int i[]:queries){
           row1=i[0];
           col1=i[1];
           row2=i[2];
           col2=i[3];
           for(int x=row1;x<=row2;x++){
            for(int y=col1;y<=col2;y++){
                a[x][y]+=1;
            }
           }
      }
      return a;  
    }
}