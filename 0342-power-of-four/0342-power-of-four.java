class Solution {
    public boolean isPowerOfFour(int n) {
        boolean a=check(n);
        return a;
    }
    public boolean check(int n){
        if(n==1){
            return true;
        }
         else if(n==0){
            return false;
        }
        else if(n%4!=0){
            return false;
        }
        else{
            return check(n/4);
        }
        
    }
}