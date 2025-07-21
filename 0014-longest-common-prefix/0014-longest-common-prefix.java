class Solution {
    public String longestCommonPrefix(String[] st) {
        if(st==null || st.length ==0)
        return "";
        for(int i=0;i<st[0].length();i++){
            char ch = st[0].charAt(i);
            for(int j=1;j<st.length;j++){
                if(i>=st[j].length() || st[j].charAt(i) != ch){
                    return st[0].substring(0,i);
                }
            }
        }
        return st[0];
    }
}