class Solution {
    public int concatenatedBinary(int n) {
        int bit=0;
        long ans=0;
        long mod=1000000007;
        for(int i=1;i<=n;i++){
            if((i &(i-1))==0)bit++;
            ans=((ans<<bit)+i)%mod;
        }
        return (int)ans;
    }
}