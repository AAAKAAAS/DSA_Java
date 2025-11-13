class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> res= new ArrayList<>();
     List<Integer>path= new ArrayList<>();
     solve(0,candidates,target,path,res);
         return res;
    }
    public void solve(int a,int[]b,int k,List<Integer>path,List<List<Integer>> res){
        if(k==0){
            res.add(new ArrayList<>(path));
            return;
        }
        if(k<0)return;
        for(int i=a;i<b.length;i++){
            path.add(b[i]);
            solve(i,b,k-b[i],path,res);
            path.remove(path.size()-1);
        }
    }
} 
 