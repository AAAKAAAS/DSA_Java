class Solution {
    public int lengthOfLastWord(String S) {
        String s=S.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ') break;
            count++;
        }
        return count;
    }
}