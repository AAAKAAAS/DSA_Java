class Solution {
    public String largestGoodInteger(String num) {
        for(int i=9;i>=0;i--){
            StringBuilder s=new StringBuilder();
            s=s.append(i).append(i).append(i);
            if(num.contains(s))return s.toString();
        }
        return "";
    }
}