class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int a=0;
        for(int i=1;i<=n;i++){
            sum+=(i%7)+a;
          if(i%7==0){
             a++;
             sum+=7;
          }
          
        }
        return sum;
    }
}