class Solution {
    public long sumAndMultiply(int n) {
        long x=0,sum=0;
        char a[]=(n+"").toCharArray();
       for(char ch:a){
        if(ch=='0')continue;
        else{
          x=x*10+(ch-'0');
          sum+=ch-'0';
        }
       } 
       long ans=sum*x;
       return ans;
    }
}