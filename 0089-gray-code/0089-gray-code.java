class Solution {
    public List<Integer> grayCode(int n) {
        int t= 1<<n;
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<t;i++)a.add(i^(i>>1));
        return a;
    }
}