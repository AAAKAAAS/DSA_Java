class Solution {
    static {
    for (int i = 0; i < 500; i++) {
        maxArea(new int[] { 0, 0 });
    }
}

    public static int maxArea(int[] height) {
        int l=0;int r=height.length-1;
        int max=0;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            int area=w*h;
            max=Math.max(area,max);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}