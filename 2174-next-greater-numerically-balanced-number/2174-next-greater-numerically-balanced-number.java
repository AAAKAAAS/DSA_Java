class Solution {
    public int nextBeautifulNumber(int n) {
        for(int i=n+1;;i++){
           if(balanced(i))return i;
        }
    }
    public boolean balanced(int n){
        int c[]= new int[10];
        for(int i=n;i>0;i=i/10){
            c[i%10]++;
        }
        for(int i=0;i<=9;i++){
            if(c[i]>0&&c[i]!=i)return false;
        }
        return true;
    }
}