class Solution {
    public int searchInsert(int[] arr, int target) {
        int m=arr.length;
        int low=0,high=m-1,ans=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){ans=mid;high=mid-1;}
            else low=mid+1;
        }
        return ans;
    }
}