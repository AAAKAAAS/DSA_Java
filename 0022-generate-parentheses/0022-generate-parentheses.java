class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve(res,"",0,0,n);
        return res;
    }
    public void solve(List<String> res,String a,int o,int c,int n){
        if(a.length()==2*n){
            res.add(new String(a));
            return;
        }
        if(o<n)solve(res,a+"(",o+1,c,n);
        if(c<o)solve(res,a+")",o,c+1,n);
    }
}