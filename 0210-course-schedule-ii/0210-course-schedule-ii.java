class Solution {
    public int[] findOrder(int num, int[][] pre) {
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<num;i++)adj.add(new ArrayList());
        for(int i[]:pre){
            adj.get(i[1]).add(i[0]);
        }
        List<Integer> topo=isCycle(adj,num);
        int [] a= new int[topo.size()];
        for(int i=0;i<topo.size();i++)a[i]=topo.get(i);
        return a;
    }
     public List<Integer> isCycle(List<List<Integer>> adj,int V){
     int in[]= new int[V];
     for(int i=0;i<V;i++){
        for(int j:adj.get(i))in[j]++;
     }
     Queue<Integer> q = new LinkedList<>();
     List<Integer> topo = new ArrayList<>();
     int c=0;
     for(int i=0;i<V;i++)if(in[i]==0)q.offer(i);
     while(!q.isEmpty()){
        int node=q.poll();c++;topo.add(node);
        for(int neigh:adj.get(node)){
            in[neigh]--;
            if(in[neigh]==0)q.offer(neigh);

        }
     }
     if(c!=V)return new ArrayList<>();
     return topo;
}
}