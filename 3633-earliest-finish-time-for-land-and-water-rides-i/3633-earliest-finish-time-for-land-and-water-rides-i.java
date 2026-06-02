class Solution {
    public int earliestFinishTime(int[] l, int[] ld ,int[] w, int[] wd) {
        int min= Integer.MAX_VALUE;
        int n=l.length,m=w.length;
        for(int i=0;i<n;i++){
            int d= l[i]+ ld[i];
            for(int j=0;j<m;j++){
                if(d>=w[j]){
                    int a=wd[j]+d;
                    min=Math.min(min,a);
                }
                else {
                    int b=w[j]+wd[j];
                    min=Math.min(min,b);
                }
            }
        }
         for(int i=0;i<m;i++){
            int d= w[i]+ wd[i];
            for(int j=0;j<n;j++){
                if(d>=l[j]){
                    int a=ld[j]+d;
                    min=Math.min(min,a);
                }
                else {
                    int b=l[j]+ld[j];
                    min=Math.min(min,b);
                }
            }
        }
        return min;
    }
}