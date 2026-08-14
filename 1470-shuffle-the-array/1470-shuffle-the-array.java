class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0,j=n,N=nums.length,b=0;
        int a[]= new int[N];
      while(b<N){
        a[b++]=nums[i++];
        a[b++]=nums[j++];
       }
       return a;
    }
}