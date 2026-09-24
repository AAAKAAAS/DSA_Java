class Solution {
    int p[],r[];
    public int makeConnected(int n, int[][] co) {
        if (co.length < n - 1)
    return -1;
        p=new int[n];r=new int[n];
        for(int i=0;i<n;i++){p[i]=i;r[i]=0;}
        for(int curr[]:co){
            int x=curr[0],y=curr[1];
            int xp=find(x);
            int yp=find(y);
            if(xp!=yp)union(xp,yp);
        }
        int c=0;
        for(int i=0;i<n;i++)if(p[i]==i)c++;
        return c-1;
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