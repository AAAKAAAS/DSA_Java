class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int ans[][]= new int[m][n];
        int s=m*n;
        k%=s;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int idx=i*n+j;
                int newidx = (idx+k)% s;
                int r= newidx/n;
                int c= newidx%n;
                ans[r][c]=grid[i][j];
            }
        }
        List<List<Integer>> res= new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> a = new ArrayList<>();
            for(int j=0;j<n;j++){
                a.add(ans[i][j]);
            }
            res.add(a);
        }
        return res;
    }
}