class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int l=f.length;
      for(int i=0;i<l;i++){
         if(f[i]==0){
            boolean left = (i==0)|| (f[i-1]==0);
            boolean right= (i==l-1)|| (f[i+1]==0);
         
         if(left&&right){
            f[i]=1;
            n--;
            
         }
      } 
      }
      return n<=0; 
    }
}