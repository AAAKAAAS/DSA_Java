class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false ;
        }
        Map<Character,Character> a = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char orginal = s.charAt(i);
            char replacement = t.charAt(i);
            if(!a.containsKey(orginal)){
                if(!a.containsValue(replacement)){
                    a.put(orginal,replacement);
                }
                else{
                    return false;
                }
            }
            else{
                char mapped = a.get(orginal);
                if(mapped!= replacement) return false;
            }
        }
        return true;
    }
}