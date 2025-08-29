class Solution {
    public String convertToTitle(int c) {
        StringBuilder sb= new StringBuilder();
        while(c>0){
            c--;
            int r=c%26;
             sb.append((char)('A'+r));
             c=c/26;
        }
        return sb.reverse().toString();       
    }
}