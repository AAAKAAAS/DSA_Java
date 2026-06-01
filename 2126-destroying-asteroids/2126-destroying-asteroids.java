class Solution {
    public boolean asteroidsDestroyed(int mass, int[] a) {
      Arrays.sort(a);  
      double sum=mass;
      int n=a.length;
      for(int i=0;i<n;i++){
        if(sum>=a[i])sum+=a[i];
        else return false;
      }
      return true;
    }
}