class Solution {
    public int maxProduct(int[] nums) {
      int max=nums[0];
      int min=nums[0];
      int res=nums[0];
      for(int i=1;i<nums.length;i++){
        int tem=max;
        max=Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));
        min=Math.min(nums[i],Math.min(tem*nums[i],min*nums[i]));
        if(res<max)res=max;
      }  
      return res;
    }
}