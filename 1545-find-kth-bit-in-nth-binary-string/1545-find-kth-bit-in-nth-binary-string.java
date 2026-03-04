class Solution {
    public char findKthBit(int n, int k) {
      String s="011";
      while(s.length()<k)s=next(s);
      return s.charAt(k-1); 
    }
    public String next(String s){
        StringBuilder ab= new StringBuilder(s);
        ab.append('1');
        for(int i=s.length()-1;i>=0;i--)ab.append(s.charAt(i)=='0'?'1':'0');
        return ab.toString();
    }
}