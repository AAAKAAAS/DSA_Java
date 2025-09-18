class Solution {
    public int lengthOfLongestSubstring(String s) {
     Map<Character,Integer> a= new HashMap<>();
     int maxlen=0;int left=0;
     for(int right=0;right<s.length();right++){
        char c= s.charAt(right);
        if(a.containsKey(c)){
            left=Math.max(left,a.get(c)+1);
        }
        a.put(c,right);
        maxlen=Math.max(maxlen,right-left+1);
     }   
     return maxlen;
    }
}