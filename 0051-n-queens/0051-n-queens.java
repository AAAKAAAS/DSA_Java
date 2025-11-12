class Solution {
    public List<List<String>> solveNQueens(int n) {
       List<List<String>> res = new ArrayList<>();
       char a[][]=new char[n][n];
       for(char b[]:a)Arrays.fill(b,'.');
       solve(0,a,res,n);
       return res;
    }
    public void solve(int r,char a[][],List<List<String>> res,int n){
        if(r==n){
            res.add(construct(a));
            return ;
        }
        for(int i=0;i<n;i++){
            if(safe(i,r,a,n)){
                a[r][i]='Q';
                solve(r+1,a,res,n);
                a[r][i]='.';
            }
        }
    }
    public List<String> construct(char a[][]){
        List<String> path= new ArrayList<>();
        for(char b[]:a){
            path.add(new String(b));
        }
        return path;
    }
    public boolean safe(int c,int r,char a[][],int n){
        for(int i=0;i<r;i++)if(a[i][c]=='Q')return false;
        for(int i=r-1, j=c-1;i>=0&&j>=0;i--,j--)if(a[i][j]=='Q')return false;
        for(int i=r-1, j=c+1;i>=0&&j<n;i--,j++)if(a[i][j]=='Q')return false;
        return true;
    }
}