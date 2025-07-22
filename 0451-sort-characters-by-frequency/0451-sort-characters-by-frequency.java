class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> a = new HashMap<>();
        List<Character>[] b= new ArrayList[s.length()+1];
        for(char c :s.toCharArray()){
            a.put(c,a.getOrDefault(c,0)+1);
        }
        a.keySet().forEach(
            c->{
                if(b[a.get(c)]==null){
                    b[a.get(c)]= new ArrayList();
                }
                b[a.get(c)].add(c);
            }
        );
        for(int i=b.length-1;i>0;i--){
            if(b[i]!=null){
            for(char c:b[i]){
                for(int j=0;j<i;j++){
                    sb.append(c);
                }
            }
           }
        }
        return sb.toString();
    }
}