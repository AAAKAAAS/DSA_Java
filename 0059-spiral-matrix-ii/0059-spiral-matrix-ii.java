class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int idx=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++)arr[top][i]=idx++;
            top++;
            for(int j=top;j<=bottom;j++)arr[j][right]=idx++;
            right--;
            if(top<=bottom){for(int i=right;i>=left;i--)arr[bottom][i]=idx++;bottom--;}
            if(left<=right){for(int j=bottom;j>=top;j--)arr[j][left]=idx++;left++;}
        }
        return arr;
    }
}