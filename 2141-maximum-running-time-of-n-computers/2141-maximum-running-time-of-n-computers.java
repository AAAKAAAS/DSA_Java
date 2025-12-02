class Solution {
    public long maxRunTime(int n, int[] batteries) {
      long sum=0;
      for(int i:batteries)sum+=i;
      long left=0;
      long right=sum/n;
      long ans=0;
      while(left<=right){
        long mid=left+(right-left)/2;
        if(can(mid,n,batteries)){
            ans=mid;
            left=mid+1;
        }
        else right=mid-1;
      }
      return ans;  
    }
    public boolean can(long T,int n,int a[]){
        long t=0;
        for(int i:a)t+=Math.min(i,T);
        return t>=(long)n*T;
    }
}