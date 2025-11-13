class Solution {
    public List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> res= new ArrayList<>();
     List<Integer>path= new ArrayList<>();
     solve(1,n,k,path,res);
         return res;
    }
    public void solve(int a,int n,int k,List<Integer>path,List<List<Integer>> res){
        if(path.size()==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=a;i<=n;i++){
            path.add(i);
            solve(i+1,n,k,path,res);
            path.remove(path.size()-1);
        }
    }
}