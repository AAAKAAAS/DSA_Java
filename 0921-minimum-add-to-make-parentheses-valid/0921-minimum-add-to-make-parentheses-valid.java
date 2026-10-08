class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> s1 = new Stack<>();
       // Stack<Character> s2 = new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='(')s1.push('(');
            else if(ch==')'){
                if(s1.isEmpty())c++;
               else s1.pop();
            }
        }
           return c+s1.size();
        
    }
}