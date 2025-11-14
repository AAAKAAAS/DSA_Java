class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     List<List<Integer>> res = new ArrayList<>();
     List<Integer> path = new ArrayList<>();
     Arrays.sort(nums);
     solve(path,res,0,nums.length,nums);
     return res;   
    }
    public void solve(List<Integer> path,List<List<Integer>> res,int a,int n,int nums[]){
        res.add(new ArrayList(path));
        for(int i=a;i<n;i++){
            
           if(i>a&&nums[i]==nums[i-1])continue;
           path.add(nums[i]);
            solve(path,res,i+1,n,nums);
            path.remove(path.size()-1);
        }
    }
}