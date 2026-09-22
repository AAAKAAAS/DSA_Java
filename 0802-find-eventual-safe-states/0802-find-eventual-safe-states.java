class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        int n=graph.length;
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        int in[]= new int[n];
        for(int i=0;i<n;i++){
            for(int j:graph[i]){
                adj.get(j).add(i);
                in[i]++;
            }
        }
        boolean state[]= new boolean[n];
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<n;i++)if(in[i]==0)q.offer(i);
        while(!q.isEmpty()){
            int node=q.poll();
            state[node]=true;
            for(int neigh:adj.get(node)){
                in[neigh]--;
                if(in[neigh]==0)q.offer(neigh);
            }
        }
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++)if(state[i])a.add(i);
        return a;
    }
}