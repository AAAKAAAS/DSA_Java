class Solution {
    public int maximumJumps(int[] nums, int target) {
      /* 
       Greedy Approach
       int c=0;
        int i=0;
        int n=nums.length;
        for(int j=1;j<n;j++){
            long b= nums[j]-nums[i];
            if(-target<=b && b<= target){c++;i=j;}
        }
        if(i!=n-1)return -1;
        return c; */

        int c=0,n=nums.length;
        int dp[]=new int[n]; 
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i=0;i<n;i++){
            if(dp[i]==-1)continue ;
            for(int j=i+1;j<n;j++){
                if(Math.abs(nums[j]-nums[i])<=target){dp[j]=Math.max(dp[j],dp[i]+1);}
            }
        }
        return dp[n-1];
    }
}