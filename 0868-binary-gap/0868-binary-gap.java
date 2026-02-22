class Solution {
    public int binaryGap(int n) {
      if(Integer.bitCount(n)==1)return 0;
      int last=-1;
      int pos=0;
      int max=0;
      while(n>0)
      {
        if((n&1)==1){
            if(last!=-1)max=Math.max(max,pos-last);
            last=pos;
        }
        n>>=1;
        pos++;
      }  
      return max;
    }
}