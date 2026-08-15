class Solution {
    public String decodeString(String s) {
        Stack<Integer> a= new Stack<>();
        Stack<StringBuilder> b = new Stack<>();
        int num=0;
        StringBuilder curr = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');

            }
            else if(ch=='['){
                a.add(num);
                b.add(curr);
                num=0;
                curr=new StringBuilder();
            }
            else if (ch==']'){
                int rep=a.pop();
                StringBuilder prev = b.pop();
                for(int i=0;i<rep;i++){
                    prev.append(curr);
                }
                curr=prev;
            }
            else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}