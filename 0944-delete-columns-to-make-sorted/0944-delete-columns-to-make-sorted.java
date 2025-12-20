class Solution {
    public int minDeletionSize(String[] strs) {
        int row=strs.length;
        int col=strs[0].length();
        int c=0;
        for(int i=0;i<col;i++){
            for(int j=1;j<row;j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}