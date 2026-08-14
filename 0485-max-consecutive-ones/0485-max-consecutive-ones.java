class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0;
        for(int i:nums){
            if(i==1)c++;
            else {
                max=Math.max(max,c);
                c=0;
            }
        }
        if(c!=0)max=Math.max(max,c);
        return max;
    }
}