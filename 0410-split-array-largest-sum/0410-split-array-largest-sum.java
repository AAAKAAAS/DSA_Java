class Solution {
    public int splitArray(int[] nums, int k) {
       int left=0;int right=0;
       for(int num:nums){
        left=Math.max(left,num);
        right+=num;
       } 
       while(left<right){
        int mid=left+(right-left)/2;
         if(canSplit(nums,k,mid)){
            right=mid;
         }
         else{
            left=mid+1;
         }
       }
       return left;
    }
    public boolean canSplit(int nums[],int k,int maxSum){
        int sa=1;
        int currsum=0;
        for(int num:nums){
            if(currsum+num>maxSum){
                sa++;
                currsum=num;
                if(sa>k)return false;
            }
            else{
                currsum+=num;
            }
        }
        return true;
    }
}