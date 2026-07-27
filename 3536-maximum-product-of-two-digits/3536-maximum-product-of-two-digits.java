class Solution {
    public int maxProduct(int n) {
        String s=Integer.toString(n);
        int a=1;
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        int N=ch.length;
        for(int i=0;i<2;i++){
            char c= ch[N-i-1];
            int b=c-'0';
            a*=b;  
        }
        return a;
    }
}