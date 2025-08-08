class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int maxcol=getMaxIndex(mat[mid],n);
            int midval=mat[mid][maxcol];
            int upval=(mid>0)? mat[mid-1][maxcol]:-1;
            int downval=(mid<m-1)? mat[mid+1][maxcol]:-1;
            if(midval>upval && midval>downval) return new int[]{mid,maxcol};
            else if(midval<downval) low=mid+1;
            else high=mid-1;
        }
        return new int[]{-1,-1};
    }
    public int getMaxIndex(int row[],int n){
        int idx=0;
        for(int i=0;i<n;i++){
           if(row[i]>row[idx]) idx=i;
        }
        return idx;
    }
}