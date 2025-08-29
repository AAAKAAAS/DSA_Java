class Solution {
    public int titleToNumber(String c) {
        int r=0;
        for(int i=0;i<c.length();i++){
            char c1=c.charAt(i);
            r=r*26+(c1-'A'+1);
        }
        return r;
    }
}