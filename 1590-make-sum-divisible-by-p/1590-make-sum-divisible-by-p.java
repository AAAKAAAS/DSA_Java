class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum=0;
        int n=nums.length;
        for(int i:nums)sum+=i;
        int rem=(int)(sum%p);
        if(rem==0)return 0;
        long prefix =0;
        int ans = nums.length;
        Map<Integer,Integer> a = new HashMap<>();
        a.put(0,-1);
        for(int i=0;i<nums.length;i++){
            prefix=(prefix+nums[i])%p;
            int need = (int)(prefix-rem+p)%p;
            if(a.containsKey(need)) ans=Math.min(ans,i-a.get(need));
            a.put((int)prefix,i);
        }
        return (ans==nums.length)?-1:ans;
    }
}