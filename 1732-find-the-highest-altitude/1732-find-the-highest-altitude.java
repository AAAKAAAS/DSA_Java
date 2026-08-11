class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int sum[]= new int[n+1];
        sum[0]=0;
        for(int i=1;i<=n;i++)
            sum[i]=sum[i-1]+gain[i-1];
        Arrays.sort(sum);
     return sum[n];
    }
}