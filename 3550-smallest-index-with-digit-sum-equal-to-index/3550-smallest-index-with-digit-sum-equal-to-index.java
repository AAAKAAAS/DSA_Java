class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=sum(nums[i]);
            if(sum==i)return i;
        }
        return -1;
    }
    public int sum(int a){
        int sum=0;
        for(int i=a;i>0;i=i/10){
         sum+=i%10;
        }
        return sum;
    }
}