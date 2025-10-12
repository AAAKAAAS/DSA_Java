class Solution {
    public int characterReplacement(String s, int k) {
        int f[]= new int[26];
        int i=0,j=0,max=0,maxlen=0;
        while(i<s.length()){
            f[s.charAt(i)-'A']++;
            max=Math.max(max,f[s.charAt(i)-'A']);
            while(i-j+1-max>k){
                f[s.charAt(j)-'A']--;
                j++;
            }
            maxlen=Math.max(maxlen,i-j+1);
            i++;
        }
        return maxlen;
    }
}