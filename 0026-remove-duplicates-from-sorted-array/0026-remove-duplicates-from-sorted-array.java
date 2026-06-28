class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int n=nums.length;
        int idx=0;
        for(int i=0;i<n;i++){
        if(!seen.contains(nums[i])){
            seen.add(nums[i]);
            nums[idx++]=nums[i];
        }
        }
        return idx;
    }
}