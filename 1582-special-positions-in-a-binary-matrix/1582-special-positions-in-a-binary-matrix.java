class Solution {
    public int numSpecial(int[][] mat) {
        int c=0;
        
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    boolean rflag=true;
                            boolean cflag=true;
                   for(int a=0;a<m;a++)if(a!=i && mat[a][j]==1){ rflag=false;break;}
                   for(int a=0;a<n;a++)if(a!=j && mat[i][a]==1){ cflag=false;break;}
                   if(rflag && cflag)c++;
                }
            }
        }
        return c;
    }
}