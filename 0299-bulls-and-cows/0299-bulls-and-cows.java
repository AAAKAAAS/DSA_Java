class Solution {
    public String getHint(String secret, String guess) {
       Map<Integer,Boolean> a = new HashMap<>();
       Map<Character,Integer> d= new HashMap<>();
       StringBuilder sb= new StringBuilder();
       int b=0;
       for(int i=0;i<secret.length();i++){
        a.put(i,true);
        if(secret.charAt(i)==guess.charAt(i)){
            b++;
            a.put(i,false);
        }
       else{
        d.put(secret.charAt(i),d.getOrDefault(secret.charAt(i),0)+1);
       }
       } 
        sb.append(b);
        sb.append("A");
        int c=0;
        for(int i=0;i<secret.length();i++){
            if(a.get(i)&&d.containsKey(guess.charAt(i))&&d.get(guess.charAt(i))>0){
                c++;
                d.put(guess.charAt(i),d.get(guess.charAt(i))-1);
        }
        }
        sb.append(c);
        sb.append("B");
        return sb.toString();
    }
}