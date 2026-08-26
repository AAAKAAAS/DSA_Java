class Solution {
    public int missingMultiple(int[] nums, int k) {
        int b=1;
        Set<Integer> abc = new HashSet<>();
        for(int i:nums)abc.add(i);
        while(true){
         int a=k*b;
         if(!abc.contains(a))return a;
         b++;
        }
       // return -1;
    }
}