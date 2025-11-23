class Solution {
    public int maxSumDivThree(int[] nums) {
        int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE,c=Integer.MAX_VALUE,d=Integer.MAX_VALUE;
        int sum=0;
        for(int i:nums){
            sum+=i;
            if(i%3==1){
                if(i<a){
                    b=a;
                    a=i;
                }
                else if(i<b)b=i;
            }
            else if(i%3==2){
                if(i<c){
                    d=c;
                    c=i;
                }
                else if(i<d)d=i;
            }
        }
        if(sum%3==0)return sum;
        int ans=0;
        int e=0;int f=0;
        if(sum%3==1){
            e=a;
            f=((c==Integer.MAX_VALUE) ||(d==Integer.MAX_VALUE))? Integer.MAX_VALUE:(c+d);
            ans=sum - Math.min(e,f);
        }
        if(sum%3==2){
            e=c;
            f=((a==Integer.MAX_VALUE) ||(b==Integer.MAX_VALUE))? Integer.MAX_VALUE:(a+b);
            ans=sum - Math.min(e,f);
        }
        return ans<0 ? 0:ans;
    }
}