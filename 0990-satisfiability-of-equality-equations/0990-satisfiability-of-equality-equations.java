class Solution {
    int p[],r[];
    public boolean equationsPossible(String[] eq) {
        p= new int[26];r=new int[26];
        for(int i=0;i<26;i++){
            p[i]=i;
            r[i]=0;
        }
        for(String s:eq)if(s.charAt(1)=='=')union(s.charAt(0)-'a',s.charAt(3)-'a');
        for(String s:eq)if(s.charAt(1)=='!')if(find(s.charAt(0)-'a')==find(s.charAt(3)-'a'))return false;
        return true;
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
        else {
            p[yp]=xp;
            r[xp]++;
        }
    }
}