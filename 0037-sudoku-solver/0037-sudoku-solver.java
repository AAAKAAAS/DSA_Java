class Solution {
    public void solveSudoku(char[][] b) {
        solve(b);
    }
    public boolean solve(char[][]b){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(b[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(valid(b,i,j,c)){
                            b[i][j]=c;
                            if(solve(b))return true;
                            b[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean valid(char b[][],int i,int j,char a){
        for(int d=0;d<9;d++){
            if(b[d][j]==a)return false;
            if(b[i][d]==a)return false;
        }
        int i1=(i/3)*3;
        int j1=(j/3)*3;
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                if(b[i1+r][j1+c]==a)return false;
            }
        }
        return true;
    }
}