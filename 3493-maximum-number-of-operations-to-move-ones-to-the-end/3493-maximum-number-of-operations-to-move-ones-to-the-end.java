class Solution {
    public int maxOperations(String s) {
       int c1=0;
       int ans=0;
       int n=s.length();
       for(int i=0;i<n;i++){
        char a=s.charAt(i);
        if(a=='1')c1++;
        else if(i+1==n||s.charAt(i+1)=='1')ans+=c1;
       } 
       return ans;
    }
}