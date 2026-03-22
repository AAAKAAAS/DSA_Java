class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){if(isE(mat,target))return true;mat=rot(mat);}return false;
    }
    public int[][] rot (int mat[][]){
        int n=mat.length;
        int res[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              res[i][j]=mat[n-j-1][i];
            }
        }
        return res;
    }
    public boolean isE(int a[][],int b[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=b[i][j])return false;
            }
        }
        return true;
    }
}