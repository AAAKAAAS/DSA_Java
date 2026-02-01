class Solution {
    String map[] = { "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String > ans = new ArrayList<>();
    if(digits.length()==0)return ans;    
    helper(digits,0,ans,"");
    return ans;
    }
    public void  helper(String digits, int idx,List<String >ans, String current){
       if(idx==digits.length()){ans.add(current);return ;}
       String s =map[digits.charAt(idx)-'0'];
       for(int i=0;i<s.length();i++){
        helper(digits,idx+1,ans,current+s.charAt(i));
       }
    }
}