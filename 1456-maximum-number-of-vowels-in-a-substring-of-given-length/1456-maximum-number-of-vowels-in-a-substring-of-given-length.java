class Solution {
    public int maxVowels(String s, int k) {
        int c=0,n=s.length();
        char ch[]=s.toCharArray();
        for(int i=0;i<k;i++){
            if(is(ch[i]))c++;
        }
        int max=c;
        for(int i=k;i<n;i++){
            if(is(ch[i-k]))c--;
            if(is(ch[i]))c++;
            max=Math.max(max,c);
        }
        return max;
    }
    public boolean is (char ch){
        char C=Character.toUpperCase(ch);
        if(C=='A'||
           C=='E'||
           C=='I'||
           C=='O'||
           C=='U'  )return true;
           return false;
    }
}