class Solution {
    public int countTriples(int n) {
        int C=0;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            int cc= i*i+j*j;
            int c=(int)Math.sqrt(cc);
            if(c<=n && c*c==cc)C++;
        }
       } 
       return C;
    }
}