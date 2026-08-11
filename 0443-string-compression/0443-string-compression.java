class Solution {
    public int compress(char[] chars) {
      int i=0,j=0,n=chars.length;
      while(i<n){
        char curr=chars[i];
        int c=0;
        while(i<n && chars[i]==curr){
            i++;c++;
        }
        chars[j++]=curr;
        if(c>1){
            String cmt=String.valueOf(c);
            for(char C:cmt.toCharArray())chars[j++]=C;
        }
      }
      return j;
    }
}