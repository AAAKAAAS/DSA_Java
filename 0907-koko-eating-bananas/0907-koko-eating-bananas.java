class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int low=1;
      int high=Arrays.stream(piles).max().getAsInt();
      while(low<high){
        int mid=low+(high-low)/2;
        int hrs=0;
        for(int pile:piles){
            hrs+=(pile+mid-1)/mid;
        }
        if(hrs>h){
            low=mid+1;
        }
        else{
            high=mid;
        }
      }
        return low;
      
    }
}