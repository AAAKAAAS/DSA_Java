class Solution {
    public int longestValidParentheses(String s) {
        int max=0;
        Stack<Integer> a=new Stack<>();
        a.push(-1);
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='(')a.push(i);
          else{
            a.pop();
            if(a.isEmpty())a.push(i);
            else max=Math.max(max,i-a.peek());
          }
        }
        return max;
    }
}