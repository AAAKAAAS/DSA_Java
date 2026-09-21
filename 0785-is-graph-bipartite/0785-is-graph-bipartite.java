class Solution {
    public boolean isBipartite(int[][] graph) {
        int m=graph.length;
        int c[]= new int[m];
        for(int i=0;i<m;i++){
            if(c[i]!=0)continue;
            Queue<Integer> q=new LinkedList<>();
            q.offer(i);
            c[i]=1;
            while(!q.isEmpty()){
                int a=q.poll();
                for(int b:graph[a]){
                 if(c[b]==0){
                    c[b]=-c[a];
                    q.offer(b);
                 }
                 else if (c[b]==c[a])return false;
                }
            }
        }
        return true;
    }
}