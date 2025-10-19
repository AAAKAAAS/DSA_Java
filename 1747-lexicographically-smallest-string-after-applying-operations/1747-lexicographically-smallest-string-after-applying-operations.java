class Solution {
    public String findLexSmallestString(String s, int a, int b) {
       Queue<String> q= new LinkedList<>();
       Set<String> vis= new HashSet<>();
       q.add(s);
       vis.add(s);
       String ans=s;
       while(!q.isEmpty()){
        String curr=q.poll();
        if(curr.compareTo(ans)<0)ans=curr;
        char ch[]=curr.toCharArray();
        for(int i=1;i<ch.length;i+=2)ch[i]=(char)((((ch[i]-'0')+a)%10)+'0');
        String d=new String(ch);
        if(!vis.contains(d)){
            vis.add(d);
            q.offer(d);
        }
        int n= curr.length();
        String c=curr.substring(n-b)+curr.substring(0,n-b);
        if(!vis.contains(c)){
            vis.add(c);
            q.offer(c);
        }
       }
       return ans;
    }
}