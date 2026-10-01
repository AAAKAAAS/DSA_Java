class Solution {
    public int smallestDivisor(int[] nums, int t) {
        Arrays.sort(nums);
        int low=1,high=nums[nums.length-1],ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(can(mid,nums,t)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public boolean can(int mid,int nums[],int t){
        int sum=0;
       for(int i=0;i<nums.length;i++){
           int a=(nums[i]+mid-1)/mid;
           sum+=a;
           if(sum>t)return false;
       }
       return true;
    }
}