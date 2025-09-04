class Solution {
    public int findClosest(int x, int y, int z) {
        int dx=z-x;
        int dy=y-z;
        if(dy<0)dy=dy*-1;
        if(dx<0)dx=dx*-1;
        if(dx<dy)return 1;
        if(dx>dy)return 2;
        return 0;
    }
}