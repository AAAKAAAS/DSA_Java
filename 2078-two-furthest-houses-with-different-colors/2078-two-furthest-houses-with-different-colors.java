class Solution {
    public int maxDistance(int[] c) {
        int max=Integer.MIN_VALUE;
        int n=c.length;
      for(int i=0;i<n;i++){
        for(int j=n-1;j>i;j--){
           if(c[i]!=c[j])max=Math.max((j-i),max);
        }
      }  
      return max;
    }
}