class Solution {
    int p[],r[];
    public boolean validPath(int n, int[][] e, int s, int d) {
        connect(n,e);
        if(find(s)==find(d))return true;
        return false;
    }
    public void connect(int n,int e[][]){
         p=new int[n];r=new int[n];
        for(int i=0;i<n;i++){p[i]=i;r[i]=0;}
        for(int curr[]:e){
            int x=curr[0],y=curr[1];
            int xp=find(x);
            int yp=find(y);
            if(xp!=yp)union(xp,yp);
        }
    }
    public int find(int x){
        if(p[x]==x)return x;
        return p[x]=find(p[x]);
    }
    public void union(int x,int y){
         int xp=find(x);
            int yp=find(y);
            if(xp==yp)return;
            if(r[xp]>r[yp])p[yp]=xp;
            else if(r[xp]<r[yp])p[xp]=yp;
            else {p[yp]=xp;r[xp]++;}
    }
}