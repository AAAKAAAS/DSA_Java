class Solution {
    public int countBinarySubstrings(String s) {
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))b++;
            else{
                c+=Math.min(a,b);
                a=b;
                b=1;
            }
        }
        c+=Math.min(a,b);
        return c;
    }
}