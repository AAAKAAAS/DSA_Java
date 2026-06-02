class Solution {
    public int[][] merge(int[][] in) {
        Arrays.sort(in,(a,b)->a[0]-b[0]);
        List<int[]> list = new ArrayList<>();
        list.add(in[0]);
        for(int i=1;i<in.length;i++){
            int last[]=list.get(list.size()-1);
            if(last[1]>=in[i][0]){
                last[1]=Math.max(last[1],in[i][1]);
            }
            else{
                list.add(in[i]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}