class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(n,1,k,path,res);
        return res;
    }
    public void backtrack(int sum ,int last,int k,List<Integer> path ,List<List<Integer>> res){
        if(sum==0 && path.size()==k){res.add(new ArrayList<>(path));return;}
        for(int i=last;i<=9;i++){
            if(i<=sum){
            path.add(i);
            backtrack(sum-i,i+1,k,path,res);
            path.remove(path.size()-1);
            }else break;
        }
    }
}