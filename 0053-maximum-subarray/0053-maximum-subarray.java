class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)return nums[0];
        int sum=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
         sum+=nums[i];
         
         if(nums[i]>sum)sum=nums[i];
          max=Math.max(sum,max);
        }
        return max;
    }
}