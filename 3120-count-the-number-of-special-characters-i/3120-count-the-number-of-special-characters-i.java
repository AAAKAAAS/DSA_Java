class Solution {
    public int numberOfSpecialChars(String word) {
        boolean low[] = new boolean [26];
        boolean upp[] = new boolean [26];
         for(char c: word.toCharArray()){
            if(Character.isLowerCase(c)){
                low[c-'a']=true;
            }
            else upp[c-'A']=true;
         }
         int count=0;
         for(int i=0;i<26;i++){
            if(low[i]&& upp[i])count++;
         }
         return count;
    }
}