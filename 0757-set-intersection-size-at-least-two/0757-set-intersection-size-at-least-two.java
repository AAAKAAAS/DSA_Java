class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->
        a[1]==b[1]?b[0]-a[0]:a[1]-b[1]);
        int p1=-1,p2=-1,c1=0;
        for(int i[]:intervals){
            int start=i[0];
            int end=i[1];
           boolean c = p1>=start && p1<=end;
           boolean d=  p2>=start && p2<=end;
           if(c && d)continue;
           else if(d){
            p1=p2;
            p2=end;
            c1++;
           }
           else{
            p2=end;
            p1=end-1;
            c1+=2;
           }
                   }
                   return c1;
    }
}