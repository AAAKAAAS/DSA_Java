class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length-1;
        int a=1;
        for(int i=0;i<3;i++){
            a*=nums[n-i];
        }
        int b=nums[n];
        for(int i=0;i<2;i++){
            b*=nums[i];
        }
        if(b>a)return b;
        return a;
    }
}