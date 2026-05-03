class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        for(int i=1;i<=n;i++)if(good(i))c++;
        return c;
    }
    public boolean good(int i){
        boolean flag=false;
        while(i>0){
            int a=i%10;
            if(a==3 || a==4 || a==7)return false;
            if(a==2 || a==5 || a==6 || a==9)flag=true;
            i=i/10;
        }
        return flag;
    }
}