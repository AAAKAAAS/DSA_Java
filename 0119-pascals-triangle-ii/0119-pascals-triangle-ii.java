class Solution {
    public List<Integer> getRow(int idx) {
        List<Integer> row = new ArrayList<>();
        for(int i=0;i<=idx;i++)row.add(1);
        for(int i=2;i<=idx;i++){
            for(int j=i-1;j>0;j--){
                row.set(j,row.get(j)+row.get(j-1));
            }
        }
        return row;
    }
}