class Solution {
    public int mirrorDistance(int n) {
      int a=0,f=n;
      while(n>0){
        int b=n%10;
        a=a*10+b;
        n=n/10;
      }
      int c= Math.abs(a-f);
      return c;
    }
}