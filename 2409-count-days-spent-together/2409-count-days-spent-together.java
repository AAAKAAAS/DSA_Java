class Solution {
    public int countDaysTogether(String A, String B, String C, String D) {
        int a=day(A),b=day(B),c=day(C),d=day(D);
        return Math.max(0,Math.min(b,d)-Math.max(a,c)+1);
    }
    public int day(String A){
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int m=Integer.parseInt(A.substring(0,2));
        int d=Integer.parseInt(A.substring(3));
        for(int i=0;i<m-1;i++)d+=days[i];
        return d;
    }
}