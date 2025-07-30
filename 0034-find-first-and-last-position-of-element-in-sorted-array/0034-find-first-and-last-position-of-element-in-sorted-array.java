class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ab[] ={-1,-1};
        for(int a=0;a<nums.length;a++){
            if(nums[a]==target) {
                ab[0]=a;
        
        for(int a1=nums.length-1;a1>=0;a1--){
            if(nums[a1]==target){
            ab[1]=a1;
            return ab;
        }
        }
    }
    }
    return ab;
}
}