class Solution {
    public int minStartValue(int[] nums) {
        int n=nums.length;
        int p[]= new int[n+1];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            p[i]=p[i-1]+nums[i-1];
            min=Math.min(p[i],min);
        }
       if(min>0)return 1;
       return Math.abs(min)+1;
    }
}