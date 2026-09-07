class Solution {
    int dp[];
    public int climbStairs(int n, int[] costs) {
         dp= new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,n,costs);
    }
    int solve(int i, int n, int[] costs) {

    if(i == n)
        return 0;
    if(dp[i]!=-1)return dp[i];
    int ans = Integer.MAX_VALUE;

    if(i + 1 <= n)
        ans = Math.min(ans,
                costs[i] + 1 + solve(i + 1, n, costs));

    if(i + 2 <= n)
        ans = Math.min(ans,
                costs[i + 1] + 4 + solve(i + 2, n, costs));

    if(i + 3 <= n)
        ans = Math.min(ans,
                costs[i + 2] + 9 + solve(i + 3, n, costs));

    return dp[i]=ans;
}
}