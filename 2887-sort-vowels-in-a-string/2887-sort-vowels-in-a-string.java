class Solution {
    public String sortVowels(String s) {
        List<Character> v= new ArrayList<>();
        Set<Character>V= Set.of('a','e','i','o','u','A','E','I','O','U');
        StringBuilder ab = new StringBuilder();
        for(char c:s.toCharArray()){
            if(V.contains(c)){
                v.add(c);
            }
        }
        Collections.sort(v);
        int idx=0;
        for(char c: s.toCharArray()){
            if(V.contains(c)){
             ab.append(v.get(idx++));   
            }
            else{
                ab.append(c);
            }
        }
        return ab.toString();
    }
}