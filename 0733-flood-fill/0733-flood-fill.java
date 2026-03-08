class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      int org=image[sr][sc];
      if(org==color)return image;
      dfs(image,sr,sc,color,org);
      return image;  
    }
    public void dfs(int [][] image,int r,int c,int color,int org){
        int m=image.length;
        int n=image[0].length;
       if(r<0 || r>=m || c<0 || c>=n)return ;
       if(image[r][c]!=org)return ;
       image[r][c]=color;

       dfs(image,r-1,c,color,org);
       dfs(image,r+1,c,color,org);
       dfs(image,r,c-1,color,org);
       dfs(image,r,c+1,color,org);
    }
}