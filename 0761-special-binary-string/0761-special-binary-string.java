class Solution {
    public String makeLargestSpecial(String s) {
       int c=0;
       int start=0;
       List<String> part = new ArrayList<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1')c++;
        else c--;
        if(c==0){
            String inner =s.substring(start+1,i);
            part.add("1"+makeLargestSpecial(inner)+"0");
            start=i+1;
        }
       }
       Collections.sort(part,Collections.reverseOrder());
       StringBuilder ab= new StringBuilder();
       for(String str:part)ab.append(str);
       return ab.toString();

    }
}