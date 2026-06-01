class Solution {
    public int maxProfit(int[] p) {
        int min=p[0];
        int profit=0;
        int max=0;
        int n=p.length;
        for(int i=1;i<n;i++){
            min=Math.min(min,p[i]);
            profit=p[i]-min;
            max=Math.max(max,profit);
        }
        return max;
    }
}