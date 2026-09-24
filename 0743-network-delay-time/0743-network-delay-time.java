class Solution {
    public int networkDelayTime(int[][] e, int V, int src) {
                ArrayList<ArrayList<int[]> >adj = new ArrayList<>();
        for(int i=0;i<=V;i++)adj.add(new ArrayList<>());
        for(int i=0;i<e.length;i++){
            adj.get(e[i][0]).add(new int[]{e[i][2],e[i][1]});
         //   adj.get(e[i][1]).add(new int[]{e[i][2],e[i][0]});
        }
        int res[]= new int [V+1];
        Arrays.fill(res,Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        res[src]=0;
        pq.offer(new int[]{0,src});
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int d=curr[0];
            int node=curr[1];
            if (d > res[node]) {
                continue;
            }
            for(int []v:adj.get(node)){
                int neigh=v[1];
                int dist=v[0];
                if(d+dist<res[neigh]){
                    res[neigh]=d+dist;
                    pq.offer(new int[]{d+dist,neigh});
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=V;i++){
            max=Math.max(max,res[i]);
            if(res[i]==Integer.MAX_VALUE)return -1;
        }
        return max;
    }
}