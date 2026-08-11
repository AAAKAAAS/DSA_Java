class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0,n=nums.length;
        for(int i=0;i<k;i++)sum+=nums[i];
        double max=sum;
        for(int i=k;i<n;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            max=Math.max(max,sum);
        }
        double a=max/k;
        return a;
    }
}