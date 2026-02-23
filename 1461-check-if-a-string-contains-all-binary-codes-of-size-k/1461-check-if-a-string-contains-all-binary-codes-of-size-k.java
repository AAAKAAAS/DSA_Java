class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k)return false;
        Set<String> a= new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
          a.add(s.substring(i,i+k));
        }
        return (a.size()==(1<<k));
    }
}