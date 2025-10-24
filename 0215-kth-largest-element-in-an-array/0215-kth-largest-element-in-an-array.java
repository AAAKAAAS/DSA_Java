class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> a= new PriorityQueue<>();
      for(int i:nums){
        a.offer(i);
        if(a.size()>k)a.poll();
      } 
      return a.peek(); 
    }
}