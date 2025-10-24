class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer,Integer> a= new HashMap<>();
     for(int i:nums){
        a.put(i,a.getOrDefault(i,0)+1);
     }
     PriorityQueue<Integer> b = new PriorityQueue(
        (d,e)-> a.get(d)-a.get(e)
     );
     for(int i:a.keySet()){
       b.add(i);
       if(b.size()>k){
        b.poll();
       }
     }
     int c[]=new int[k];
     for(int i=0;i<k;i++){
        c[i]=b.poll();
     }
     return c;
    }
}