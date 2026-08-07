class Solution {
    public String removeStars(String s) {
        Stack<Character> a = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                
                if (!a.isEmpty()) {
                    a.pop();
                }
            } else {
                a.push(ch);
            }
        }
        
        StringBuilder abc = new StringBuilder();
        while (!a.isEmpty()) {
            abc.append(a.pop());
        }
        
        return abc.reverse().toString();
    }
}
