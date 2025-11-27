class Solution {
    public long maxSubarraySum(int[] nums, int k) {
      int n =nums.length;
      long minprefix[]=new long[k];
      Arrays.fill(minprefix,Long.MAX_VALUE);
      minprefix[0]=0;
      long ans=Long.MIN_VALUE;
      long prefix=0;
      for(int i=0;i<n;i++){
        prefix+=nums[i];
        int mod=(i+1)%k;
        if(minprefix[mod]!=Long.MAX_VALUE){
            ans=Math.max(ans,prefix-minprefix[mod]);
        }
        minprefix[mod]=Math.min(prefix,minprefix[mod]);
      }
      return ans;  
    }
}