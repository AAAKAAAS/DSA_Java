class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n=nums1.length;
       int m=nums2.length;
       int a[]=new int[n+m];
       for(int i=0;i<n;i++){
        a[i]=nums1[i];
       }
       int j=0;
       for(int i=n;i<m+n;i++){
        a[i]=nums2[j];
        j++;
       }
       Arrays.sort(a);
       for (int num : a) {
            System.out.print(num + " ");
        }
       double m1;
       int d=n+m;
       if(d%2==1){
         m1=a[d/2];
       }
       else{
        m1=(a[d/2-1]+a[d/2])/2.0;
       }
       return m1;
    }
}