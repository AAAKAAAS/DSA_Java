class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
      char [][] res = new char[n][m]; 
      for(int i=0;i<m;i++){
        int a = n-1;
        for(int j=n-1;j>=0;j--){
             if (box[i][j] == '*') {
                    a = j - 1;
                } 
                else if (box[i][j] == '#') {
                    char temp = box[i][a];
                    box[i][a] = '#';
                    box[i][j] = temp;
                    a--;
                }
        }
      }  

      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            res[j][m-1-i]=box[i][j];
        }
      }
      return res;
    }
}