class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int max=0;
        int maxarea=0;
       for(int i[] :d){
        int l=i[0];int w=i[1];
           int d1=l*l+w*w;
           int area=l*w;
           if(d1>max|| (d1 == max && area > maxarea)){
            max=d1;
            maxarea=area;
           }
            
            
       }
       return maxarea; 
    }
}