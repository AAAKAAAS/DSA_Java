class Solution {
    public int addDigits(int num) {
        while(num>9){
            num=getnxt(num);
        }
        return num;
    }
    public int getnxt(int n){
        int sum=0;
        for(int i=n;i>0;i=i/10){
            int d=i%10;
            sum+=d;
        }
        return sum;
    }
}