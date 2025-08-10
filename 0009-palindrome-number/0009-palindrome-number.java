class Solution {
    public boolean isPalindrome(int x) {
        int sum =0 , d=0;
        for (int i= x; i>0; i=i/10){
             d=i%10;
           sum=sum*10 + d;
        }
        if(sum==x){
            return true ;
        }
        else {
            return false ;
        }
    }
}