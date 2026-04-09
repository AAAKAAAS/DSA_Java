class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()%2!=0)return false;
        int cU=0,cD=0,cL=0,cR=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U')cU++;
            else if(moves.charAt(i)=='D')cD++;
            else if(moves.charAt(i)=='L')cL++;
            else if(moves.charAt(i)=='R')cR++;
        }
        if(cD==cU && cR==cL)return true;
        return false;
    }
}