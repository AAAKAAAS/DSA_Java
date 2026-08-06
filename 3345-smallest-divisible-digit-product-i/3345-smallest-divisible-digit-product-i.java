class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+10;i++){
           int sum=pro(i);
            if(sum%t==0)return i;
        }
        return -1;
    }
    public int pro(int i){
        int pro=1;
        while(i>0){
            pro*=i%10;
            i/=10;
        }
        return pro;
    }
}