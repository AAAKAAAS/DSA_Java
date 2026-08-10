class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))return "";
        int i=str1.length();
        int j=str2.length();
        int len=gcd(i,j);
        return str1.substring(0,len);
    }
    public int gcd(int a,int b){
        return b==0 ? a:gcd(b,a%b);
    }
}