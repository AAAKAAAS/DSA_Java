class Solution {
    List<List<String>> a = new ArrayList<>();
    public List<List<String>> partition(String s) {
        back(s,0,new ArrayList<>());
        return a;
    }
    public void back(String s,int idx,List<String> b){
        if(idx==s.length())
        {
            a.add(new ArrayList<>(b));
            return ;
        }
        for(int i=idx;i<s.length();i++){
            if(isString(s,idx,i))
            {
                b.add(s.substring(idx,i+1));
                back(s,i+1,b);
                b.remove(b.size()-1);
            }
            
               
            
        }
    }
    public boolean isString(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }
}