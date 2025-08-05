class Solution {
    public int findKthPositive(int[] arr, int k) {
      Map<Integer,Boolean> a = new HashMap<>();
      for(int nums:arr){
        a.put(nums,true);
      }
      for(int i=1;i<=10000;i++){
        if(a.get(i)==null){
            k--;
        }
        if(k==0)return i;
      }
      return -1;
    }
}