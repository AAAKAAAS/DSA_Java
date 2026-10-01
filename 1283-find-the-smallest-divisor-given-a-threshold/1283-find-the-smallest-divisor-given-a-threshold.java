class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        while(low<high){
            int sum=0;
            int mid=low+(high-low)/2;
            for(int num:nums){
                sum+=(num+mid-1)/mid;
            }
            if(sum>threshold){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}