class Solution {
    public int findMiddleIndex(int[] nums) {
        int t=0,l=0;
        for(int n:nums)t+=n;
        for(int i=0;i<nums.length;i++){
            int r=t-l-nums[i];
            if(l==r)return i;
            l+=nums[i];
        }
        return -1;
    }
}