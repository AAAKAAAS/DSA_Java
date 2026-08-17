class Solution {
    public int calculate(String s) {
        int num=0,res=0,sign=1;
        Stack<Integer> abc= new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch))num=num*10+(ch-'0');
            else if(ch=='+'){
                res+=sign*num;
                num=0;
                sign=1;
            }
            else if(ch=='-'){
                res+=sign*num;
                num=0;
                sign=-1;
            }
            else if(ch=='('){
                abc.push(res);
                abc.push(sign);
                res=0;sign=1;
            }
            else if(ch==')'){
                res+=sign*num;
                num=0;
                res=abc.pop()*res+abc.pop();
            }
        }
        res+=sign*num;
        return res;
    }
}