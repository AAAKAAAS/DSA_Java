class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> a = new HashMap<>();
        for(int i:arr){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();

        for (int freq : a.values()) {
            set.add(freq);
        }

        return set.size() == a.size();
    }
}