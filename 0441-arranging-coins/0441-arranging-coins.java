class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        for(int i=1;i>0;i++){
            n=n-i;
            if(n<0) break;
            c++;
        }
        return c;
    }
}