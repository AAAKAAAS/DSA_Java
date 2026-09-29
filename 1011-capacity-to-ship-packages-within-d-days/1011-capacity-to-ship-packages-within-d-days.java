class Solution {
    int []W;int D;
    public int shipWithinDays(int[] w, int d) {
        int n=w.length;
        int low=0;
        int high=0;
        int ans=high;
        D=d;W=w;
        for(int i:w){low=Math.max(low,i);high+=i;}
        while(low<=high){
            int mid=low+(high-low)/2;
            if(pos(mid)){ans=mid;high=mid-1;}
            else {low=mid+1;}
        }
        return ans;
    }
    public boolean pos(int a){
        int days=1;int curr=0;
        for(int w:W){
            if(curr+w>a){curr=w;days++;}
            else curr+=w;
        }
        return days<=D;
    }
}