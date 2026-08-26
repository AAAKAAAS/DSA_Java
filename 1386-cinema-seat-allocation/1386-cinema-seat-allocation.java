class Solution {
    public int maxNumberOfFamilies(int n, int[][] rs) {
        int rwr=0;
        int idx=0;
        int ans=0;
        Arrays.sort(rs,(a,b)->
        a[0]==b[0]?a[1]-b[1]:a[0]-b[0]
        );
        while(idx<rs.length){
        int row=rs[idx][0];
        rwr++;
        boolean seat[]= new boolean[11];
        while(idx<rs.length && rs[idx][0]==row){
            seat[rs[idx][1]]=true;
            idx++;
        }
        boolean left=(!seat[2] && !seat[3] && !seat[4] && !seat[5] );
        boolean middle=(!seat[4] && !seat[5] && !seat[6] && !seat[7] );
        boolean right=(!seat[6] && !seat[7] && !seat[8] && !seat[9] );
        if(left && right)ans=ans+2;
        else if(left||middle||right)ans++;
        
        }
        ans+=(n-rwr)*2;
        return ans;
    }
}