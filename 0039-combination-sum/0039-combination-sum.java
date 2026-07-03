class Solution {
    List<List<Integer>> a = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        back(new ArrayList<>(),0,cand,target);
        return a;
    }
    public void back(List<Integer> b,int idx,int c[],int target){
        if(target==0){
            a.add(new ArrayList<>(b));
            return ;
        }
        if(target<0)return ;
        for(int i=idx;i<c.length;i++){
            if(target-c[i]<0)continue;
            b.add(c[i]);
            back(b,i,c,target-c[i]);
            b.remove(b.size()-1);
        }
    }
}