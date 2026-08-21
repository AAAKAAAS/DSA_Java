class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> a= new ArrayList<>();
        List<Integer> b= new ArrayList<>();
        int n=nums.length;
        if(n<=2)return nums;
        a.add(nums[0]);
        b.add(nums[1]);
        for(int i=2;i<n;i++){
            if(a.get(a.size()-1)>b.get(b.size()-1))a.add(nums[i]);
            else b.add(nums[i]);
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(i<a.size())nums[i]=a.get(i);
            else nums[i]=b.get(j++);
        }
        return nums;
    }
}