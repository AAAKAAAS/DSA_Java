class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int l=bits.length;
        int i=0;
        while(i<l-1){
            if(bits[i]==1)i+=2;
            else i+=1;
        } 
        return i==l-1;
    }
}