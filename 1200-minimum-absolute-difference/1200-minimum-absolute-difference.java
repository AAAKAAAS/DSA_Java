class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n= arr.length;
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)min=Math.min(min,arr[i+1]-arr[i]);
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]==min){
                List<Integer> cur = new ArrayList<>();
                cur.add(arr[i]);
                cur.add(arr[i+1]);
            
            res.add(cur);
        }
        }
        return res;
    }
}