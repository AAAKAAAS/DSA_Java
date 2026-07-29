class Solution {
    public String smallestPalindrome(String s) {
        int f[]= new int [26];
        for(char c:s.toCharArray())f[c-'a']++;
        StringBuilder left= new StringBuilder();
        char m=0;
        for(int i=0;i<26;i++){
            for(int j=0;j<f[i]/2;j++){
                left.append((char)('a'+i));}
                if(f[i]%2==1)m=(char)('a'+i);
            
        }
        StringBuilder ans = new StringBuilder(left);
        if(m!=0)ans.append(m);
        ans.append(new StringBuilder(left).reverse());
        return ans.toString();
    }
}