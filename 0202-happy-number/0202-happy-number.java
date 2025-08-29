class Solution {
    public boolean isHappy(int n) {
       Set<Integer> seen = new HashSet<>();
       while(n!=1&&!seen.contains(n)) {
        seen.add(n);
        n=getnxt(n);
       }
       return n==1;
    }
    public int getnxt(int n){
        int sum=0;
        for(int i=n;i>0;i=i/10){
            int d=i%10;
            sum+=d*d;
        }
        return sum;
    }
}